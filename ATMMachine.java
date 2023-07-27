package com.ATMMachine;
import java.util.*;
public class ATMMachine {
	
	private int accountNumber;
	private int pin;
	private double balance;
	
	public ATMMachine(int accountNumber ,int pin, double balance) {
		this.accountNumber = accountNumber;
		this.pin = pin ;
		this.balance = balance;
	}
	
//	Task 7: ATM Machine
//	Create an ATMMachine class that simulates an ATM.
//	Implement methods to check the account balance,
//	deposit money, withdraw money, and change the PIN.
	
	public double getBalance() {
		return balance;
	}
	
	public void depositMoney(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposite Successful. Current Balance : " + balance);
		}
		else
			System.out.println("Invalid amount for deposite .");
	}
	public void withDrowMoney(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrow Successful. New Balance : " + balance);
		}
		else 
			System.out.println("Insufficient funds or Withdrow amount.");
		
	}
	
	public void changePin(int oldPin , int newPin) {
		
		if(oldPin== pin) {
			pin = newPin;
			System.out.println("Pin Changed Successfully.");
		}
		else 
			System.out.println("Invalid Pin.");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMMachine atm = new ATMMachine(12345678,0007,100000.00);
		System.out.println("Welcome to XYZ Bank.");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdrow Money.");
		System.out.println("4. Change Pin.");
		System.out.println("5. Exit");
		
		int choice ;
		do {
			System.out.println("Please Enter your choice.");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1 :
				System.out.println("Your Account Balance is :" + atm.getBalance() );
				break;
			case 2 :
				System.out.println("Enter Amount to Deposit:" );
				double depositamount = sc.nextDouble();
				atm.depositMoney(depositamount);
				break;
			case 3 :
				System.out.println("Enter Amount to Withdrow:" );
				double withdrowamount = sc.nextDouble();
				atm.withDrowMoney(withdrowamount);
				break;
			case 4 :
				System.out.println("Enter your old Pin:" );
				int oldPin = sc.nextInt();
				System.out.println("Enter your New Pin:" );
				int newPin = sc.nextInt();
				atm.changePin(oldPin,newPin);
				break;
			case 5 :
				System.out.println("Thank you for using XYZ Bank." );
				break;
			default :
				System.out.println("Invalid Choice. Please Try again.." );
			}
			
		} while(choice!=5);
		
			
		sc.close();

	}

}
