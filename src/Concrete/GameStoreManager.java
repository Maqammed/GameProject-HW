package Concrete;

import Entities.Game;
import Entities.Gamer;

public class GameStoreManager {
	public void buyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +", " + game.getGameName() + " Oyununu satin aldi" + " /" + game.getGamePrice() + " TL");
	}
}
