package utilities;

import java.util.ArrayList;

/*
 * This class' sole use is to function as a prime number sieve. It uses the Sieve of Eratosthenes to find
 * the primes below or at the given input value, and then stores the primes for use in the solutions.
 */

public class BasicPrimeFinder {
	
	private ArrayList<Integer> primes;
	
	//The input n denotes the number below or at which to find primes.
	public BasicPrimeFinder(int n) {
		
		this.primes = new ArrayList<Integer>();
		
		//This will store whether given numbers are composite or not
		boolean[] isComposite = new boolean[n + 1];
		
		int index = 2;
		
		while(index < n + 1) {
			
			//Checks off every multiple of a prime when one is found
			if(!isComposite[index]) {
				
				this.primes.add(index);
				
				for(int i = index; i < n + 1; i += index) {
					isComposite[i] = true;
				}
				
			}
			
			index++;
		}
	}
	
	public ArrayList<Integer> getPrimes(){
		return this.primes;
	}

}
