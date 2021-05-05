package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double offerPercentage;
	
	
	Game _game;
	
	
	public Campaign(Game _game) {
		super();
		this._game = _game;
	}



	public Campaign(int id, String campaignName, double offerPercentage) {
		super();
		this.offerPercentage = offerPercentage;
		this.id = id;
		this.campaignName = campaignName;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}



	public double getOfferPercentage() { //offerPercentage;
		
		return _game.getGamePrice() - (_game.getGamePrice(	) * this.offerPercentage /100);
				
	}



	public void setOfferPercentage(double offerPercentage) {
		this.offerPercentage = offerPercentage;
	}
}
