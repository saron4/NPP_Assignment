package L3Assignment.problem3;
import java.util.Scanner;

public class Main {

		Employee[] emps = null;

		public static void main(String[] args) {
			

			new Main();
		}

		Main() {
			emps = new Employee[3];
			emps[0] = new Employee("Johan Bob", 1994, 8, 3);
			emps[1] = new Employee("Saba Samuiel", 1995, 3, 8);
			emps[2] = new Employee("Susan Randolph", 1996, 1, 15);

			emps[0].createNewChecking(12350);
			emps[0].createNewSavings(1400);
			emps[0].createNewRetirement(1000);

			emps[1].createNewChecking(25000);
			emps[1].createNewSavings(45000);

			emps[2].createNewChecking(23438);
			emps[2].createNewSavings(12300);
			emps[2].createNewRetirement(3000);

			// for phase I – console output
			Scanner sc = new Scanner(System.in);
			System.out.print("Do you want to see a report of all account balances? (y/n)?");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				String info = getFormattedAccountInfo();
				System.out.println(info);
			} // display info to console
			else {
				// do nothing..the application ends here
			}
		}

		private String getFormattedAccountInfo() {
			// TODO Auto-generated method stub
			String employeeInfo = "";
			for (Employee emp : emps) {
				String checkingAccData = "";
				String savingAccData = "";
				String retirementAccData = "";

				if (emp.getCheckingAccount() != null) {
					checkingAccData += emp.getCheckingAccount().toString();
				}

				if (emp.getSavingAccount() != null) {
					checkingAccData += emp.getSavingAccount().toString();
				}

				if (emp.getRetirementAccount() != null) {
					checkingAccData += emp.getRetirementAccount().toString();
				}

				employeeInfo += String.format("Name: %s\nHire-Date: %s\nAccounts:\n%s\n%s\n%s\n", emp.getName(),
						emp.getHireDate().toString(), checkingAccData, savingAccData, retirementAccData);
			}
			return employeeInfo;
		}

	}





