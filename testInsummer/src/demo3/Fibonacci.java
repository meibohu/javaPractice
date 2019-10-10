package demo3;

public class Fibonacci {
	public static void main(String[] args) {
		int n = fibonacci(3);
		System.out.println(n);
	}


	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}

