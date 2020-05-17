package builder;

public class Application {
	public static void main(String[] args) {
		
		
		BankAccount account1 = new BankAccount.Builder(12345)
	            .withOwner("Shalintha")
	            .atBranch("Colombo")
	            .openingBalance(1000)
	            .atRate(3.5)
	            .build();
		
		BankAccount account2 = new BankAccount.Builder(12645)
	            .withOwner("Silva")
	            .atBranch("Colombo")
	            .openingBalance(1000)
	            .atRate(3.5)
	            .build();
		
		System.out.println(account1.getOwner());
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getBranch());
		
		System.out.println(account2.getOwner());
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getBranch());
		
	}

}
