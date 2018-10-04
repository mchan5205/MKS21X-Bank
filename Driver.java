public class Driver{
	public static void main(String[]args){
		BankAccount test = new BankAccount(500, 33, "test");
		System.out.println(test.getBalance());
		System.out.println(test.getAccountID());
		System.out.println(test);
		test.deposit(100);
		System.out.println(test.getBalance());
	}
}