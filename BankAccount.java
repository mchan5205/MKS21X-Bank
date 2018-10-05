public class BankAccount{
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(double newbalance, int newID, String newpass){
		balance = newbalance;
		accountID = newID;
		password = newpass;
	}
	public String toString(){
		return accountID + "\t" + balance;
	}	
	public double getBalance(){
		return balance;
	}
	public int getAccountID(){
		return accountID;
	}	
	public void setPassword(String newpass){
		password = newpass;
	}	
	public boolean deposit(double amount){
		if (amount > 0){
			balance += amount;
			return true;
		}
		else{
			return false;
		}	
	}
	public boolean withdraw(double amount){
		if (amount < balance && amount > 0){
			balance = balance - amount;
			return true;
		}
		else{
			return false;
		}	
	}	
	private boolean authenticate(String password){
		return this.password.equals(password);
	}	
	public boolean transferTo(BankAccount other, double amount, String password){
		return this.authenticate(password) && this.withdraw(amount) && other.deposit(amount);
	}	
}
