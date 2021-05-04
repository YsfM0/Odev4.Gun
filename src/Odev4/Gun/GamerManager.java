package Odev4.Gun;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager (GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("Kayýt baþarýlý --> " + gamer.getFirstName() + " " + gamer.getLastName().toUpperCase());
		}
		else {
			System.out.println("Geçersiz kiþi yada bilgiler.");
		}
		
		
	}

	@Override
	public void upDate(Gamer gamer) {
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("Güncelleme yapýldý --> " + gamer.getFirstName() );
		}
		else {
			System.out.println("Geçersiz kiþi yada bilgiler.");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerCheckService.IfRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "kiþisi silindi");
		}
		else {
			System.out.println("Geçersiz kiþi yada bilgiler.");
		}
		
	}

}
