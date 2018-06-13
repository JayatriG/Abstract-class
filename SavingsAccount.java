class SavingsAccount extends Accounts
{
	double rateofInterest;
	int time;
	SavingsAccount(double r,int t,int ac_no,String name,String addr)
	{
		time=t;
		rateofInterest=r;
		accountNumber=ac_no;
		accountHoldersName=name;
		address=addr;
	}
	void withdrawal(int amt)
	{
		balance=balance-amt;
		System.out.println(amt+" amount has been withdrawn from account "+accountNumber);
	}
	void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println(amt+" amount has been deposited to account "+accountNumber);
	}
	void calculateAmt()
	{
		balance=((balance*time*rateofInterest)/100)+balance;
	}
	public static void main(String args[])
	{
		SavingsAccount sa1=new SavingsAccount(6.4,2,1450,"Priya","XYZ Road");
		sa1.deposit(2000);
		sa1.deposit(5000);
		sa1.withdrawal(1000);
		sa1.calculateAmt();
		sa1.display();
		SavingsAccount sa2=new SavingsAccount(5.0,3,1253,"Aryan","ABC Road");
		sa2.deposit(10000);
		sa2.withdrawal(5000);
		sa2.deposit(7000);
		sa2.calculateAmt();
		sa2.display();
	}
}