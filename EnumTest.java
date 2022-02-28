package uno;
import java.util.Random;


public class EnumTest <E extends Enum<E>> {

    public enum ColorList {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    public enum ValueList {
        ZERO    { public String toString() { return "0";}},
        ONE     { public String toString() { return "1";}},
        TWO     { public String toString() { return "2";}},
        THREE   { public String toString() { return "3";}},
        FOUR    { public String toString() { return "4";}},
        FIVE    { public String toString() { return "5";}},
        SIX     { public String toString() { return "6";}},
        SEVEN   { public String toString() { return "7";}},
        EIGHT   { public String toString() { return "8";}},
        NINE    { public String toString() { return "9";}}
    }
    


    private static final RandomEnum<ColorList> Rcolor=
        new RandomEnum<ColorList>(ColorList.class);

        private static final RandomEnum<ValueList> Rvalue =
        new RandomEnum<ValueList>(ValueList.class);

    public static void main(String[] args) {
        System.out.println(Rcolor.random());
        System.out.println(Rvalue.random());
    }

    public ColorList getColor()
{
    return Rcolor.random();
}
    public ValueList getValue()
    {
        return Rvalue.random();

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