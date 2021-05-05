package ConsoleUI;

import java.time.LocalDate;

import Abstract.GamerCheckService;
import Concrete.CampaignManager;
import Concrete.GameStoreManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("Maqa", "Mmed", LocalDate.of(2003,1,1), "12345678910");
		Game game1 = new Game(1, "PUBG", 234);
		Campaign campaign = new Campaign(1, "Summer Sale", 19);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign,game1);
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.Register(gamer1);
		
		GameStoreManager gameStore = new GameStoreManager();
		gameStore.buyGame(gamer1, game1);
		
		
		
		
		
	}

}
