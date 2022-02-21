package uno;

public abstract class SpeCard extends UnoCard{

    public enum Color {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    public enum Value {
        SKIP    { public String toString() { return "SKIP";}},
        REVERSE { public String toString() { return "REVERSE";}},
        DRAWTWO { public String toString() { return "+2";}}
    }

    private final BasicCard.Color color;
    private final Value value;


    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public abstract void applyEffect(Effect effect);

    @Override
    public boolean match(UnoCard card) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return null;
    }
     

    public SpeCard(final BasicCard.Color color, final Value value){
        this.color = color;
        this.value = value;
    }

    public static boolean validColor(String colorToComp){
    	for(Color color : Color.values()){
    		if(color.name().equals(colorToComp.toUpperCase()))
    			return true;
    	}
    	return false;
    }
    
}