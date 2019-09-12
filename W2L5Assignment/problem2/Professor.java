package W2L5Assignment.problem2;

import java.time.LocalDate;

public class Professor extends DepEmployee{
	
	private int numberOfPulication;
	
	public Professor(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate.getYear(),hireDate.getMonthValue(),hireDate.getDayOfMonth());
		// TODO Auto-generated constructor stub
		
	}
	
	public int getNumberOfPulication() {
		return numberOfPulication;
	}

	public void setNumberOfPulication(int numberOfPulication) {
		this.numberOfPulication = numberOfPulication;
	}
	
}
