package w3.day1.assignments;

public class AxisBank extends BankInfo {
        
	public void deposit() {
		System.out.println("Deposit amount Rs.15000");
	}
	public static void main(String[] args) {
       
		AxisBank axb = new AxisBank();
		
		axb.fixed();
		axb.savings();
		axb.deposit();
	}

}
