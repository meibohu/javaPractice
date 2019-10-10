package recursion;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacci(6));
	}
	public static int fibonacci(int i) {
		if(i==1||i==2) {
			return 1;
		}else {
			return fibonacci(i-1)+fibonacci(i-2);
		}
	}
}

