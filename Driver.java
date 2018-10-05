public class Driver{
	public static void main(String[]args){
		BankAccount test = new BankAccount(500, 33, "test");
		System.out.println(test.getBalance());
		System.out.println(test.getAccountID());
		System.out.println(test);
		test.deposit(100);
		System.out.println(test.getBalance());
		test.withdraw(200);
		System.out.println(test.getBalance());
		BankAccount test2 = new BankAccount(1000, 33, "pass");
		test.transferTo(test2, 300, "test");
		System.out.println(test.getBalance());
	}
}