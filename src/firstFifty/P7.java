package firstFifty;

import java.util.List;

import utilities.BasicPrimeFinder;

/*
 * What is the 10 001st prime number?
 */

public class P7 {

	/*
	 * Brute-force method: Try a sieve on increasing orders of magnitude
	 * until the prime finder reports more than 10000 primes. Then, just
	 * take the 10001st prime from the list.
	 */
	public static void main(String[] args) {
		
		List<Integer> primes = null;
		BasicPrimeFinder primeFinder = null;
		int sieveMax = 100000;
		
		while(primes == null || primes.size() < 10001) {
			
			primeFinder = new BasicPrimeFinder(sieveMax);
			primes = primeFinder.getPrimes();
			sieveMax *= 10;
			
		}
		
		System.out.println(primes.get(10000));
		
	}

}
