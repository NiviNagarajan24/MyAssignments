package week2.day3.org.bank;

public class AxixBank extends BankInfo{
	public void deposit()
	{
		System.out.println("child--->deposit");
	}
	public static void main(String[] args) {
		AxixBank bankinfo=new AxixBank();
		bankinfo.deposit();
	}
}
