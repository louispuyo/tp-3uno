package uno;

import java.util.ArrayList;

interface Appliable{

/**
 * @method prepareGame
 * this method shuffle and deals cards
 */
public void prepareGame();
public void dealsCard();
public UnoCard pullCard();

}

public class Table implements Appliable{
    

    private UnoCard card;
    private PileCard pile;
    private Deck deck;
    

    @Override
    public void prepareGame() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void dealsCard() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public UnoCard pullCard() {
        // TODO Auto-generated method stub

        UnoCard card = null;
        if (this.pile.isEmpty())
        {
            ArrayList<UnoCard> list = deck.getCardBack();
            if(list.size() != 0)
            {
                for (int i = 0; i < list.size(); i++) {
                    card = list.remove(0);
                }
            }

        }
        return card;

        
    }

}
