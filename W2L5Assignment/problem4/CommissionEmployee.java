package W2L5Assignment.problem4;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales, double commissionRate ) {
		super(firstName, lastName,socialSecurityNumber );
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double getPaymnet() {
		// TODO Auto-generated method stub
		return grossSales * commissionRate;
	}
	
	@Override
	 
	public String toString() {

	return "CommissionEmployee---" + super.toString() + "  " +  "grossSale:" +grossSales + "  " + "commissionRate: " + commissionRate;
}}
