package L3Assignment.problem1;

public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("125 nn", "Chicago", "Addison", "65743");
        Address add1B = new Address("345 bb", "Colorado", "	Denver", "80239");
        Address add2A = new Address("300 hh", "Chicago", " Addison", "65743");
        Address add2B = new Address("221 Bu", "Fairfield", "IA", "52556");
         
        Customer C1 = new Customer("Sami", "Yonatan", "245-22-567");
        C1.setBillingAddress(add1A);
        C1.setShippingAddress(add1B);
         
        Customer C2 = new Customer("Radiet", "Getacheu", "245-32-9865");
        C2.setBillingAddress(add2B);
        C2.setShippingAddress(add2A);
        
        Customer[] empArray = new Customer[2];
        empArray[0] = C1;
        empArray[1] = C2;
     
        for(int i = 0; i < empArray.length; ++i) {
            Address billingAdd = empArray[i].getBillingAddress();
            if("Chicago".equalsIgnoreCase(billingAdd.getCity())) {
                System.out.println("Found a matched record : " + empArray[i].toString());
            }
        }}
	}


