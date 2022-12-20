package atm.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
   public double calcSavingWithdraw(double amount) {
	    savingBalance=(savingBalance-amount);
	    return savingBalance;
	}
	/* Customer Checking Account Withdraw input */

	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = sc.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}


	/* Customer Saving Account Withdraw input */

	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = sc.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	
	/* Customer Checking Account Deposit input */

	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit from Checking Account: ");
		double amount = sc.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer Saving Account Deposit input */


	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from Saving Account: ");
		double amount = sc.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	public double calcSavingDeposit(double amount) {
		   savingBalance =(savingBalance + amount);
		   return savingBalance;
		}
	
}
