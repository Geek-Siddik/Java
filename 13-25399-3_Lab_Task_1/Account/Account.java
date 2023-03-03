public class Account

{
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	
	
    //set Methods
	public void setAccName(String accountHolderName)
	{ 
		this.accountHolderName=accountHolderName;
	}
	public void setAccNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	
	//get Methods
	public String getAccName()
	{
		return this.accountHolderName;
	}
	public int getAccNumber()
	{
		return this.accountNumber;
	}
	public double getbalance()
	{
		return this.balance;
	}


	//deposit Method
	public void deposit (double amount)
	{
		if (amount>0)
		{
			this.balance+=amount;
			System.out.println("Updated Balance after deposit is: "+this.balance);
		}
		else
		{
			System.out.println("Can not deposit negative amount");
		}
	}
	
	
	//withdraw Method
	public void withdraw (double amount)
	{
		if (this.balance>=amount)
		{
			this.balance-=amount;
			System.out.println("Updated Balance after withdraw is: "+this.balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	
	public void showDetails()
	{
		System.out.println("\nACC HOLDER Name : " + this.accountHolderName);
		System.out.println("ACC NUMBER: " + this.accountNumber);
		System.out.println("BALANCE: " + this.balance);
	}
	
}