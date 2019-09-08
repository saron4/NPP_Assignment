package L3Assignment.problem2;

public class Main {

	public static void main(String[] args) {
			
		Employee e1 = new Employee("Biruktawit", "Brekti", 5000, 2019, 03, 20);
			
		Account a1 = new Account(e1, AccountType.CHECKING, 500.00);
		Account a2 = new Account(e1, AccountType.SAVING, 600.00);
		Account a3 = new Account(e1, AccountType.RETITEMENT, 700.00);
			
		System.out.println(e1.toString());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
			
		a1.makeDeposit(500);
		System.out.println(a1);
		System.out.println(a2.makeWithdrawal(500.00));
		System.out.println(a3.makeWithdrawal(100.00));
			
		
		}

	}

