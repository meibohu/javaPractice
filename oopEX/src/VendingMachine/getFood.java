package VendingMachine;

public class getFood {
	int price=80;
	int balance;
	int total;
	public void getFood() {
		if(balance>price) {
			System.out.println("here you are");
			balance = balance-price;
			total=total+price;
		}
		
	}
}
