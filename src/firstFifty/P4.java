package firstFifty;

import utilities.Palindromes;

/*
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P4 {

	/*
	 * Naive method: Test every product of two three digit numbers descending until
	 * the largest palindrome is found.
	 */
	public static void main(String[] args) {
		
		int palindrome = 0;
		
		for(int i = 999; i > 0; i--) {
			
			//Once the square of i becomes smaller than the largest found palindrome,
			//we know the largest palindrome has been found
			if(i * i < palindrome) {
				System.out.println(palindrome);
				return;
			}
			
			for(int j = i; j > 0; j--) {
				
				int product = i * j;
				if(Palindromes.isPalindrome(product) && product > palindrome) {
					palindrome = product;
				}
				
			}
				
		}

	}
	
	/*
	 * An alternate method could be done by showing first that all palindromic numbers
	 * have the form: 11(9091a + 910b + 100c) and solving from there, but I'm
	 * foregoing that in favor of solving the other problems.
	 */
	

}
