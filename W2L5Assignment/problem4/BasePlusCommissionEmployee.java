package W2L5Assignment.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary, double grossSales, double commissionRate ) {
		super( firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	

	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	@Override
	public double getPaymnet() {
		// TODO Auto-generated method stub
		return baseSalary + (super.getGrossSales() * super.getCommissionRate());
	}
	
	public String toString() {

		return "BasePlusCommissionEmployee---" + "  " + super.toString() + "  " +  "baseSalary:" + baseSalary;
	
}
}
