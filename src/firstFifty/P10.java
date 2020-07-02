package firstFifty;

import java.util.List;
import utilities.BasicPrimeFinder;

/*
 * Find the sum of all the primes below two million.
 */

public class P10 {

	/*
	 * Simply finds all of the primes below 2000000 and then sums them.
	 */
	public static void main(String[] args) {
		
		BasicPrimeFinder primeFinder = new BasicPrimeFinder(2000000);
		List<Integer> primes = primeFinder.getPrimes();
		long sum = 0;
		
		for(int prime : primes) {
			sum += prime;
		}

		System.out.println(sum);
	}

}
