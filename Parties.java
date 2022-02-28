package uno;

import java.security.cert.CertPathValidatorException.BasicReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import uno.*;
import uno.BasicCard.Color;
import uno.BasicCard.Value;

public class Parties implements Game{
 


    public PlayersManager<Player> pManager;
    private Effects PController;
    private Table table;
    public ArrayList<Player> players;

    @Override
    public void finish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        
    }
    public  Parties() {
        // TODO Auto-generated method stub
        this.players = new ArrayList<>();
        players.add(new Player("q",2));
        players.add(new Player("i",3));
        
    }

    @Override
	public void start() {
		if(this.checkNumberOfPlayer() == false){
			System.out.println("Number of players is too low or too high.");
			return;
		}
		

		// this.distributeCards();
		
		// this.showMatchStatus();
	}

    /**
     * PtakeCard()
     * @return {boolean}
     * Player take a card 
     */
    
   public boolean PtakeCard() 
    {
        Player curPlayer = PController.getPlayer();
        UnoCard card = this.table.pullCard();
        return true;
    }

    public boolean checkNumberOfPlayer()
    {
        if (pManager.getNumOfPlayer() <= 10)
        {
            return true;
        }
        return false;
        
    }


    public void showHand(){
		Player p = players.get(0);
    
		System.out.println("CHOOSE ONE CARD:");
		p.showCards();
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");

    
	}




}



interface TestPartie
{
    public static void main(String[] args) {
        Parties partie = new Parties();
        Player P1 = new Player("louis", 0);
        partie.init();
        // partie.start();
        for (int i = 0; i < 7; i++) {
            
            EnumTest <Color> eTest = new EnumTest<Color>();
            EnumTest <Value> vTest = new EnumTest<Value>();
            
           BasicCard c = new BasicCard(eTest.getColor().toString(), vTest.getValue().toString());
            partie.players.get(0).takeCard(c);
        }


        
        partie.players.add(P1);
        partie.players.get(0).showCards();
    String choice = new String("");

    Scanner scan = new Scanner(System.in);
    choice = scan.next();
        
        // partie.pManager.addPlayer(P1);
        // P1.showCards();

        
    }

}