package utilities;

import java.util.ArrayList;
import java.util.List;

/*
 * This class' sole use is to function as a prime number sieve. It uses the Sieve of Eratosthenes to find
 * the primes below or at the given input value, and then returns the primes for use in the solutions.
 */

public class BasicPrimeFinder {
	
	public static List<Integer> getPrimes(int n){
		
		List<Integer> primes = new ArrayList<Integer>();
		
		//This will store whether given numbers are composite or not
		boolean[] isComposite = new boolean[n + 1];
		
		int index = 2;
		
		while(index < n + 1) {
			
			//Checks off every multiple of a prime when one is found
			if(!isComposite[index]) {
				
				primes.add(index);
				
				for(int i = index; i < n + 1; i += index) {
					isComposite[i] = true;
				}
				
			}
			
			index++;
		}
		
		return primes;
	}

}
