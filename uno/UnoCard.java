package uno;


abstract class Effect{

}

public abstract class UnoCard
{
    public abstract String getColor();
    public abstract String getValue();
    public abstract void applyEffect(Effect effect);


    public abstract boolean match(UnoCard card);
	
	/**
	 * Get a representation of the UNO card.
	 * @return a string that contains the representation of the UNO card.
	 */
	@Override
    public String toString(){
    	return this.getColor()  + this.getValue();
    }


}