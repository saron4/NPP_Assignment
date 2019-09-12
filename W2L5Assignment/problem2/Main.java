package W2L5Assignment.problem2;

import java.time.LocalDate;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instances of professor and employee
		Professor pf1 = new Professor("Renuka",4000, LocalDate.of(2004,11,07));
		Professor pf2 = new Professor("Akash",5000, LocalDate.of(1989,12,03));
		Professor pf3 = new Professor("Raier",6000, LocalDate.of(2012,11,05));
		
		pf1.setNumberOfPulication(5);
		pf2.setNumberOfPulication(3);
		pf3.setNumberOfPulication(6);
		
		Secretaery s1 = new Secretaery("Biruk", 10000, LocalDate.of(1999,04,05));
		Secretaery s2 = new Secretaery("Camila", 20000, LocalDate.of(2000,05,06));
		
		s1.setOvertimeHours(20);
		s2.setOvertimeHours(10);
		
		DepEmployee[] department ={pf1, pf2, pf3,s1,s2};
		
		System.out.println("Do you want to see the total sum of all professor and employee salary?  ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		
		switch(answer) {
		case "yes":
			double sum=0.0;
			for(DepEmployee de: department) {
				sum +=de.computeSalary();
			}
			System.out.println("the total salary is: " +sum);
			break;
			
		case "no":
			System.out.println("Thank you");
			break;
		}
		
	}

}
