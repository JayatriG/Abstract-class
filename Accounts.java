abstract class Accounts
{
	double balance=0;
	int accountNumber;
	String accountHoldersName,address;
	abstract void withdrawal(int amt);
	abstract void deposit(int amt);
	void display()
	{
		System.out.println(accountHoldersName+" your current balance in "+accountNumber+" is "+balance);
	}
}