public class AccountMain
{
	public static void main(String[] args)
	{
		Account Client1=new Account();
		Client1.setAccName("MR. AA");
		Client1.setAccNumber(0001);
		Client1.setbalance(100);
		
		Client1.deposit(5000);
		Client1.withdraw(10);
		
		Account Client2=new Account();
		Client2.setAccName("MR. BBB");
		Client2.setAccNumber(0002);
		Client2.setbalance(5000);
		
		Client2.deposit(1000);
		Client2.withdraw(6000);
	}
}