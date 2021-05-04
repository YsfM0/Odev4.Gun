package Odev4.Gun;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("-- Eklenen kampanyanýn --> Adý : " + campaign.getCampaignName() + " --Oraný --> : %  " + campaign.getCampaignRate());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("-- Silinen kampanya --> " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("-- Güncellenen kampanya --> " + campaign.getCampaignName());
		
	}

}
