package Odev4.Gun;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int BirthDay;
	private String NationalityId;
	
	public Gamer () {}
	
	public Gamer(int id, String firstName, String lastName, int birthDay, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		BirthDay = birthDay;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(int birthDay) {
		BirthDay = birthDay;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
