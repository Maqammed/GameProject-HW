package Concrete;

import Entities.Campaign;
import Entities.Game;

public class CampaignManager {
	
	public void add(Campaign compaign, Game game) {
		System.out.println(compaign.getCampaignName() +" kampanyasi eklendi");
	}
	
	public void delete(Campaign compaign, Game game) {
		System.out.println(compaign.getCampaignName()+" kampanyasi silindi");
	}
	
	public void update(Campaign compaign, Game game) {
		System.out.println(compaign.getCampaignName()+" kampanyasi guncellendi");
	}
}
