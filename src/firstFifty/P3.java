package firstFifty;

import java.util.List;

import utilities.BasicPrimeFinder;

/*
 * What is the largest prime factor of the number 600851475143?
 */

public class P3 {

	/*
	 * Naive method: Finds all primes below the square root of the input number, then checks from the largest
	 * to the smallest whether each prime is a factor. The largest factor will be the first one found.
	 */
	public static void main(String[] args) {
		
		long num = 600851475143L;
		
		List<Integer> primes = BasicPrimeFinder.getPrimes((int) Math.sqrt(num));
		
		for(int i = primes.size() - 1; i > -1; i--) {
			
			if(num % primes.get(i) == 0) {
				System.out.println(primes.get(i));
				return;
			}
		
		}
		
	}

}
