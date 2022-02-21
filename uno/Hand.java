package uno;


public class Hand extends Card <UnoCard>{
	
	public Hand(){
		super();
	}
	
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getNumberOfCard() {
        return super.getNumberOfCard();
    }
	/**
	 * Add a card in the hand of the player.
	 * @return if it was possible to add the card.
	 */
	@Override
	public boolean addCard(UnoCard card){
		return this.cardList.add(card);
	}

	/**
	 * Remove a card in the hand of the player.
	 * @param index of the desired card.
	 * @return the UNO card removed.
	 */
	@Override
	public UnoCard getCard(int index){
		try{
			return this.cardList.remove(index);
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	/**
	 * Show a card that is on the hand.
	 * @param index of the desired card.
	 * @return 
	 */
	public String showCard(int index){
		try{
			return this.cardList.get(index).toString();
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
}
