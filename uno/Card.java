package uno;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import uno.CardAttributs.Colors;

import java.lang.IllegalAccessException;

class CardAttributs {

    enum Colors {
        RED,
        BLUE,
        YELLOW,
        GREEN

    }

}

public abstract class Card <CardType> {


    protected ArrayList <CardType> cardList;

   public Card() {
       this.cardList = new ArrayList<>();

    }

    
    public abstract boolean addCard(CardType c);
    public abstract CardType getCard(int index);

    public boolean isEmpty()
    {
        if (this.getNumberOfCard() > 0)
        {
            return false;
        }
        return true;
    }

    public int getNumberOfCard()
    {
        return this.cardList.size();
    }
    public abstract String getColor();


}


class PileCard<CardType> extends Card<CardType>
{
    @Override
    public CardType getCard(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean addCard(CardType c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return super.isEmpty();
    }
    @Override

    public int getNumberOfCard() {
        // TODO Auto-generated method stub
        return super.getNumberOfCard();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    PileCard()
    {

super();
    }
}