package L3Assignment.problem1;

public class Address {
	String street;
	String city;
	String state;
	String zip;
	
	Address(String street,String city,String state,String zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String toString() {
        return street + ", " + city + ", "+ state + " " + zip;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }

}
