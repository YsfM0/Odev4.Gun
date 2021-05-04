package Odev4.Gun;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager (GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("Kay�t ba�ar�l� --> " + gamer.getFirstName() + " " + gamer.getLastName().toUpperCase());
		}
		else {
			System.out.println("Ge�ersiz ki�i yada bilgiler.");
		}
		
		
	}

	@Override
	public void upDate(Gamer gamer) {
		if (gamerCheckService.IfRealPerson(gamer)) {
			System.out.println("G�ncelleme yap�ld� --> " + gamer.getFirstName() );
		}
		else {
			System.out.println("Ge�ersiz ki�i yada bilgiler.");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerCheckService.IfRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "ki�isi silindi");
		}
		else {
			System.out.println("Ge�ersiz ki�i yada bilgiler.");
		}
		
	}

}
