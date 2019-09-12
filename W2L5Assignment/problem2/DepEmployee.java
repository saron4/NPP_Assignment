package W2L5Assignment.problem2;

import java.time.LocalDate;

public class DepEmployee {
	
	private String name;
	private LocalDate hireDate;
	private double salary;
	
	public DepEmployee(String name, double salary, int year, int month,int day ) {
		this.name = name;
		this.hireDate = LocalDate.of(year, month, day);
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate gethireDate() {
		return (LocalDate)hireDate;
	}
	public void setDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}
	
	
}
