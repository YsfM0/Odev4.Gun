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
		System.out.println("Silinen oyunun ad� : " + game.getGameName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("OYUN SATILDI  **** Oyunun Ad�: " + game.getGameName() +", **** Oyuncunun Ad�:  "+ gamer.getFirstName());
			System.out.println("Sat�n al�nan fiyat " + game.getPrice()*campaign.getCampaignRate()/100 + " **** " + "Kampayas�z fiyat : " + game.getPrice());

		}
		else {
			System.out.println("Ge�ersiz Kullan�c� bilgisi . Sat�� i�lemi ba�ar�s�z");
		}
		
		
		
	}
	

}
