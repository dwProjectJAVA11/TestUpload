package Except;

public class AccountEx {

	public static void main(String[] args) {
	
		Account ac = new Account();
		ac.setBalance(1000);
		try {
			ac.widthdraw(2000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
