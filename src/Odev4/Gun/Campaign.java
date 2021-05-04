package Odev4.Gun;

public class Campaign {
	private int id;
	private String campaignName;
	private double campaignRate;
	

	public Campaign(int id, String campaignName, double campaignRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}
	
	public Campaign() {}
	
	

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

	public double getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(double campaignRate) {
		this.campaignRate = campaignRate;
	}

}
