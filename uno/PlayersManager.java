

package uno;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;

public class PlayersManager <Player>
{
    private ArrayList<Player> players;
	private boolean canAdd;
	private int currElem;
	private int nextElem;
	private boolean toRight;
	private PlayersManager<Player> pm;


public PlayersManager ()
{
	this.players = new ArrayList<Player>(10);
	this.canAdd = true;
	this.currElem = 0;
	this.nextElem =0;
	this.toRight = true;

}

public void addPlayer(Player e)
{
	this.players.add(e);

}

/** @method
 * 	allow or not the access  
 */
public void cantAdd()
{
	this.canAdd = false;

}

public int getNumOfPlayer()
{
	return this.players.size();
}

public void canAdd()
{
	this.canAdd = true;

}
public String getDirection()
{
	if (this.toRight)
	{
		return "RIGHT";
	}
	return "LEFT";
}
}

interface Display
{
	public static void main(String[] args) {
	Player p1 = new Player("louis",1);	
	p1.showCards();
}
}