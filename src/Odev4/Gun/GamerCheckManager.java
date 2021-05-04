package Odev4.Gun;

public class GamerCheckManager implements GamerCheckService {
	private String firstName = "yusuf";
	private String lastName = "mehmetoglu";
	private String nationalityIdentity = "12345678901";
	private int birthYear = 2000;

	@Override
	public boolean IfRealPerson(Gamer gamer) {

		boolean result = this.firstName == gamer.getFirstName() && this.lastName == gamer.getLastName() && this.nationalityIdentity == gamer.getNationalityId() && this.birthYear == gamer.getBirthDay();
		
		if (result==true) {
			return true;
		}
		
		else {
			return false;
		}
		

	}

}
