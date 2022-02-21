package uno;
import java.util.ArrayList;

public class Deck extends Card<UnoCard>{


    public ArrayList<UnoCard> getCardBack(){		
		ArrayList<UnoCard> newDeck = new ArrayList<UnoCard>();
		
		while(this.cardList.size() > 1){
			newDeck.add(this.cardList.remove(0));
		}
		
		return newDeck;		
	}

    @Override
    public UnoCard getCard(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int getNumberOfCard() {
        // TODO Auto-generated method stub
        return super.getNumberOfCard();
    }
    
    @Override
    public boolean addCard(UnoCard c) {
        // TODO Auto-generated method stub
        return false;
    }
}
