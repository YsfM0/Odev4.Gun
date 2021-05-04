package Odev4.Gun;

public class GameManager implements GameService{
	
	GamerCheckService gamerCheckService;
	
	public GameManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Game game) {
		System.out.println("Eklenen Oyun : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silinen oyunun adý : " + game.getGameName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("OYUN SATILDI  **** Oyunun Adý: " + game.getGameName() +", **** Oyuncunun Adý:  "+ gamer.getFirstName());
			System.out.println("Satýn alýnan fiyat " + game.getPrice()*campaign.getCampaignRate()/100 + " **** " + "Kampayasýz fiyat : " + game.getPrice());

		}
		else {
			System.out.println("Geçersiz Kullanýcý bilgisi . Satýþ iþlemi baþarýsýz");
		}
		
		
		
	}
	

}
