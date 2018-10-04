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
}
