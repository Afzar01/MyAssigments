package week4.day4assignments;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Overriden Deposit");
	}
	public static void main(String[] args) {
		AxisBank c=new AxisBank();
		c.deposit();
		c.savings();
		
	}

}
