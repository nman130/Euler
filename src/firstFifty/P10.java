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
		
		List<Integer> primes = BasicPrimeFinder.getPrimes(2000000);
		long sum = 0;
		
		for(int prime : primes) {
			sum += prime;
		}

		System.out.println(sum);
	}

}
