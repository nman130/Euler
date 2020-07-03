package utilities;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * This class takes an integer and factorizes it. The results are output in a map
 * between the prime factors and how many of them there are.
 * Additionally, it can calculate the total number of factors from the map of
 * prime factors.
 */

public class PrimeFactorizer {

	/*
	 * Factorizes the input number into prime factors and their counts.
	 */
	public static Map<Integer, Integer> primeFactorize(int n){
		
		HashMap<Integer, Integer> factors = new HashMap<Integer, Integer>();
		
		List<Integer> primes = BasicPrimeFinder.getPrimes(n / 2);
		int count = 0;
		
		for(int prime: primes) {
			count = 0;
			while(n % prime == 0) {
				count++;
				factors.put(prime, count);
				n /= prime;
			}
		}
		
		return factors;
	}
	
	/*
	 * This method takes an integer and returns all of the factors of the number.
	 */
	public static List<Integer> countFactors(int n) {
		
		List<Integer> factors = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				factors.add(i);
			}
		}
		
		return factors;
	}
	
}
