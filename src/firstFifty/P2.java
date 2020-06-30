package firstFifty;

/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class P2 {

	/*
	 * Calculates the Fibonacci numbers two at a time while they're less than 4 million and the cumulative
	 * sum of the even-valued terms. Prints the result at the end.
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		int fib1 = 0;
		int fib2 = 1;
		
		while(fib2 < 4000000) {
			
			fib1 = fib1 + fib2;
			if(fib1 % 2 == 0) {
				sum += fib1;
			}
			
			fib2 = fib1 + fib2;
			if(fib2 % 2 == 0) {
				sum += fib2;
			}
		}
		
		System.out.println(sum);
		
	}

}
