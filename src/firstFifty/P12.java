package firstFifty;

import java.util.Map;

import utilities.PrimeFactorizer;

/*
 * What is the value of the first triangle number to have over five hundred divisors?
 */

public class P12 {

	/*
	 * This implementation calculates each consecutive triangle number and checks the number of
	 * 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int triangle = 0;
		boolean notFound = true;
		
		while(notFound) {
			triangle += i;
			if(PrimeFactorizer.countFactors(triangle).size() > 500) {
				notFound = false;
			}
			i++;
		}
		System.out.println(triangle);
	}

}
