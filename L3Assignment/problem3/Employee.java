package L3Assignment.problem3;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import L3Assignment.problem2.*;
import L3Assignment.problem2.Account;
import L3Assignment.problem2.Util;

public class Employee {
	 
	private Account savingAccount;
	private Account checkingAccount;
	private Account retirementAccount;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		 GregorianCalendar cal =new
		 GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public Account getSavingAccount() {
		return savingAccount;
	}

	public Account getCheckingAccount() {
		return checkingAccount;
	}

	public Account getRetirementAccount() {
		return retirementAccount;
	}

	public void createNewChecking(double startAmount) { // implement
		checkingAccount = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) { // implement
		savingAccount = new Account(this, AccountType.SAVING, startAmount);
	}

	public void createNewRetirement(double startAmount) { // implement
		retirementAccount = new Account(this, AccountType.RETITEMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amount) {
		if (amount > 0) {

			switch (acctType) {
			case CHECKING:
				checkingAccount.makeDeposit(amount);
				break;
			case SAVING:
				savingAccount.makeDeposit(amount);
				break;
			case RETITEMENT:
				retirementAccount.makeDeposit(amount);
				break;
			default:
				break;
			}
		}
	} // implement

	public boolean withdraw(AccountType acctType, double amount) {
		boolean isEligible = true;
		if (amount > 0) {

			switch (acctType) {
			case CHECKING:
				if (checkingAccount.getBalance() >= amount) {
					checkingAccount.makeWithdrawal(amount);
				} else {
					isEligible = false;
				}
				break;
			case SAVING:
				if (savingAccount.getBalance() >= amount) {
					savingAccount.makeWithdrawal(amount);
				} else {
					isEligible = false;
				}
				break;
			case RETITEMENT:
				if (retirementAccount.getBalance() >= amount) {
					retirementAccount.makeWithdrawal(amount);
				} else {
					isEligible = false;
				}
				break;
			default:
				break;
			}
		}
		return isEligible;
	} // implement

	private String format = "name = %s, salary = %.2f, hireDay = %s";

	public String toString() {
		return String.format(format, name, Util.dateAsString(hireDate));
	}
}



				