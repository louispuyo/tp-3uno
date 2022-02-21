package uno;

public class Parties implements Game{
 


    private PlayersManager pManager;
    private Effects PController;
    private Table table;

    @Override
    public void finish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        
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
		Player p = PController.getPlayer();
		System.out.println("CHOOSE ONE CARD:");
		p.showCards();
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
	}



}
