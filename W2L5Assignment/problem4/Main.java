package W2L5Assignment.problem4;

public class Main {

	public static void main(String[] args) {
		double totalSumOfEmp = 0;
			Employee[] emp = { new CommissionEmployee("Adnan","Ahmed", "32-45-65", 40000,20),
					           new HourlyEmployee("Belay", "Kirubel", "44-56-89", 500, 5),
							   new SalariedEmployee("Kidus", "Abebe", "56-78-09", 300),
							   new BasePlusCommissionEmployee("Abeba", "Girma", "45-56-78", 3000, 20, 10)
			
	};
			
			for(Employee arr: emp ) {
				
				totalSumOfEmp += arr.getPaymnet();
				System.out.println(arr);
			}
			
			System.out.println("the total payment of employees is:" +totalSumOfEmp);
	
}}
