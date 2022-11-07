package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation: data hiding, medicine inside capsule
		// Requirement to create encapsulation:
				// 1. apply private access modifier to the variable
				// 2. public method - to get & set the value of the variable
	
	private String ssn;
	private String dob;
	
	public String getSsn() {
		return ssn.substring(5);
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob.substring(6);
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
