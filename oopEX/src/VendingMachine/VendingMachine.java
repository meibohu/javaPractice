package VendingMachine;
public class VendingMachine {
	int price=80;
	int balance;
	int total;

//	private int f() {
//		// TODO Auto-generated method stub
//		return 20;
//	}
	
	VendingMachine(){
		total = 0;
	}
	VendingMachine(int price){
		this.price = price;
	}
	void showPrompt() {
		System.out.println("ppp");
	}
	void insertMoney(int amount) {
		balance = balance+amount;
		showBalance();
	}
	void showBalance() {
		System.out.println(balance);
	}
	void getFood() {
		if(balance>price) {
			System.out.println("here you are");
			balance = balance-price;
			total=total+price;
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			VendingMachine vm = new VendingMachine();
//			vm.showPrompt();
//			vm.insertMoney(10);
//			vm.getFood();
//			vm.showBalance();
//			vm.insertMoney(90);
//			vm.getFood();
//			vm.showBalance();			
			
			VendingMachine vm1 = new VendingMachine(50);
			vm1.showBalance();
			vm1.insertMoney(110);
			vm1.getFood();
			vm1.showBalance();
	}
}
