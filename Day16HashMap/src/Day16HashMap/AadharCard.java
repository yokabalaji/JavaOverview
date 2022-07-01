package Day16HashMap;

public class AadharCard {
	private long aadharNumber;
	private String personName;
	private int personAge;
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public AadharCard(long aadharNumber, String personName, int personAge) {
		this.aadharNumber = aadharNumber;
		this.personName = personName;
		this.personAge = personAge;
	}
	public String toString() {
		return "AadharNumber=" + aadharNumber + ", personName=" + personName + ", personAge=" + personAge;
	}
	


}
