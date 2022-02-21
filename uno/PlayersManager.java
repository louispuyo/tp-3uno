

package uno;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;

public class PlayersManager
{
    private ArrayList <Player> players;
	private boolean canAdd;
	private int currElem;
	private int nextElem;
	private boolean toRight;
	private static PlayersManager pM = null;


private PlayersManager ()
{
	this.players = new ArrayList<>();
	this.canAdd = true;
	this.currElem = 0;
	this.nextElem =0;
	this.toRight = true;

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