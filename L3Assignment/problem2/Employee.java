package L3Assignment.problem2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String name, String nickName, double salary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		this.nickName = nickName;
		this.salary = salary;
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", nickName=" + nickName + ", salary=" + salary + ", hireDay=" + hireDay
				+ "]";
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}



