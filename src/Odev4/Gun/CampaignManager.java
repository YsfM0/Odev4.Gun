package Odev4.Gun;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("-- Eklenen kampanyan�n --> Ad� : " + campaign.getCampaignName() + " --Oran� --> : %  " + campaign.getCampaignRate());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("-- Silinen kampanya --> " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("-- G�ncellenen kampanya --> " + campaign.getCampaignName());
		
	}

}
