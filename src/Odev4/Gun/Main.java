package Odev4.Gun;

public class Main {

	public static void main(String[] args) {
		
//		*****************  GAMER  ******************
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("yusuf");
		gamer1.setLastName("mehmetoglu");
		gamer1.setBirthDay(2000);
		gamer1.setNationalityId("12345678901");
		
		Gamer gamer2 = new Gamer(); //yanlýþ kullanýcý
		gamer2.setId(2);
		gamer2.setFirstName("kk2");
		gamer2.setLastName("k2");
		gamer2.setBirthDay(2000);
		gamer2.setNationalityId("21354");
		
		gamerManager.add(gamer1);
//		gamerManager.delete(gamer1);
//		gamerManager.upDate(gamer1);
		System.out.println("*********************************************************************************************");
		
//		******************************* CAMPAÝGN *****************************
		
		Campaign campaign = new Campaign();
		campaign.setId(61);
		campaign.setCampaignName("Adam gibi kampanya");
		campaign.setCampaignRate(61);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
//		campaignManager.delete(campaign);
//		campaignManager.update(campaign);
		
		System.out.println("*********************************************************************************************");

		
//		********************  Game ********************
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("cs-go");
		game.setGameDetail("savaþ oyunu");
		game.setPrice(200);
			
		
		GameManager gameManager = new GameManager(new GamerCheckManager());
		gameManager.add(game);
		gameManager.sell(game, gamer1,campaign);
//		gameManager.delete(game);
		
	
		
		
	}
	
 
}
