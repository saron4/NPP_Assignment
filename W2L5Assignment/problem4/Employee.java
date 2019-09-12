package W2L5Assignment.problem4;

public abstract class Employee {

	private String  firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	 public Employee(String firstName, String lastName, String socialSecurityNumber ) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.socialSecurityNumber = socialSecurityNumber;
	 }
	 	
	public abstract double getPaymnet();

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

	public String getSocialSecurityNumer() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumer( String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	 
	public String toString() {
	
	return    "firstName: " +firstName + "  " + "lastName: " + lastName +"  " + "socialSecuNumber:" + socialSecurityNumber ;
	}
	
}
