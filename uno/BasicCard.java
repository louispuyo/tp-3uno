package uno;

import uno.CardAttributs.Colors;
import uno.SpeCard.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BasicCard extends UnoCard {


    public enum Color {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }
    
    
    private final Color color;
    private final Value value;
    
    /**
     * This enum represent a type which elements are numbers of the card.
     */
    public enum Value {
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
    
            
   
  

    
    
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return this.color.toString();
    }

    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return this.value.toString();
    }

    @Override
    public boolean match(UnoCard card) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public void applyEffect(Effect effect) {
        // TODO Auto-generated method stub
    }
    



    public BasicCard(final Value value, final Color color) {
        super();
        this.value = value;
        this.color = color;

    }

    public static boolean validColor(String colorToComp){
    	for(Color color : Color.values()){
    		if(color.name().equals(colorToComp.toUpperCase()))
    			return true;
    	}
    	return false;
    }



}

