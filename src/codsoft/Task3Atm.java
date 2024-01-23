package codsoft;
import java.util.*;
	class Task3ATM {
	    private  Task3AtmUser bankAccount;

	    public Task3ATM(Task3AtmUser bankAccount) {
	        this.bankAccount = bankAccount;
	    }

	    public  void withdraw(double amount) {
	        if (bankAccount.withdraw(amount) == true) {
	            System.out.println("Withdrawal successful. Remaining balance: Rs:" + bankAccount.getBalance());
	        } else {
	            System.out.println("Insufficient funds. Withdrawal failed.");
	        }
	    }

	    public  void deposit(double amount) {
	        bankAccount.deposit(amount);
	        System.out.println("Deposit successful. New balance: Rs:" + bankAccount.getBalance());
	    }

	    public   void checkBalance() {
	        System.out.println("Current balance: RS:" + bankAccount.getBalance());
	    }
	    
	    	}


