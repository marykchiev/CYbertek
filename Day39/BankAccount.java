package Day39;

public class BankAccount {
	
String accountHolder;
double balance;

public void showAccountHolder()
{
	System.out.println("Account holder's name is :" +accountHolder);
}

public void showBalance()
{
	System.out.println("Account Balance : "+balance);
}

public void add100Dollars()
{
	balance=balance+100;
}
public static void main(String[] args)
{
	BankAccount b1=new BankAccount();
	b1.accountHolder="Ashraf";
	b1.balance=1_000_000;
	
	BankAccount b2=new BankAccount();
	b2.accountHolder="Maksatbek";
	b2.balance=100_000;
	
	b1.showAccountHolder();
	b1.showBalance();
	b1.add100Dollars();
	b1.showBalance();
	
	b2.showAccountHolder();
	b2.showBalance();
	
	
}

public static String transfer1(Class BankAccount1, Class BankAccount2, int x)
{
	return "Transfer done";
}


}
