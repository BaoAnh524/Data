import java.util.Arrays;

public class Fibonacci {
	// get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		return getFibonacci(n-1) + getFibonacci(n-2);
	}

	// This method is used to display a Fibonaccci series based on
	//the parameter n.Ex.n=10==>0 1 1 2 3 5 8 13 21 34

	public static void printFibonacci(int n) {
		int[] Fn = new int[100];
		if(n==1) System.out.println(0); 
		if(n==2) System.out.println(1); 
		Fn[n] = getFibonacci(n-1) + getFibonacci(n-2);
		System.out.println(Arrays.toString(Fn));
		
	}
	public static void main(String[] args) {
		//System.out.println(getFibonacci(10));
		printFibonacci(10);
	}
}
