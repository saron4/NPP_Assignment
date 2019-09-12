package W2L5Assignment.problem4;

public class HourlyEmployee extends Employee {
	
		private double wage;
		private double hours;
		
		public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage, double hours) {
			super( firstName,  lastName, socialSecurityNumber);
			this.hours = hours;
			this.wage = wage;
		}
		
		public double getWage() {
			return wage;
		}

		public void setWage(double wage) {
			this.wage = wage;
		}

		public double getHours() {
			return hours;
		}


		public void setHours(double hours) {
			this.hours = hours;
		}


		@Override
		public double getPaymnet() {
			// TODO Auto-generated method stub
			return wage * hours;
		}
		@Override
		 
		public String toString() {

		return "HouerlyEmployee---" + "  " +super.toString() + "  " + "Wage:" + wage + "  " + "Hours:" + hours;
	}
}
