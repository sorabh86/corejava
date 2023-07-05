package com.github.sorabh86.designpattern.facade;

class Customer {
	public String name;
	public Customer(String name) {this.name=name;}
}

//Complex subsystems
class Bank {
	public boolean hasSufficientSavings(Customer c, int amount) {
		System.out.println("Check bank for savings");
		return true;
	}
}

class Credit {
	public boolean hasGoodCredit(Customer c) {
		System.out.println("Check credit for good standing");
		return true;
	}
}

class Loan {
	public boolean hasNoBadLoans(Customer c) {
		System.out.println("Check loans for bad loans");
		return true;
	}
}

//Facade
class Mortgage {
	private Bank bank = new Bank();
	private Loan loan = new Loan();
	private Credit credit = new Credit();

	public boolean isEligible(Customer c, int amount) {
		System.out.println("Checking eligibility for " + c.name);
		boolean eligible = true;
		if (!bank.hasSufficientSavings(c, amount)) {
			eligible = false;
		} else if (!loan.hasNoBadLoans(c)) {
			eligible = false;
		} else if (!credit.hasGoodCredit(c)) {
			eligible = false;
		}
		return eligible;
	}
}

//Client code for Facade Pattern
public class Example2 {
	public static void main(String[] args) {
		Mortgage mortgage = new Mortgage();
		Customer customer = new Customer("Sorabh Vashistha");
		boolean eligible = mortgage.isEligible(customer, 125000);
		System.out.println("\n" + customer.name + " has been " + (eligible ? "approved" : "rejected"));
	}
}
