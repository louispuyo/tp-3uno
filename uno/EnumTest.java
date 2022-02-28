package uno;
import java.util.Random;


public class EnumTest <E extends Enum<E>> {

    public enum ColorList {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    

    private static final RandomEnum<ColorList> r =
        new RandomEnum<ColorList>(ColorList.class);

    public static void main(String[] args) {
        System.out.println(r.random());
    }

    private static class RandomEnum<E extends Enum<E>> {

        private static final Random RND = new Random();
        private final E[] values;

        public RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }

        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }
}