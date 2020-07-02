package firstFifty;

/*
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class P9 {

	/*
	 * Loops through all possible Pythagorean triplets where the sum of the numbers is 1000.
	 * Prints when the triplet is a valid Pythogorean triplet, then returns.
	 */
	public static void main(String[] args) {
		
		for(int c = 500; c > 0; c--) {
			for(int b = c - 1; b > 0; b--) {
				if(c * c == b * b + (1000 - c - b) * (1000 - c - b)) {
					System.out.println((1000 - c - b) * b * c);
					return;
				}
			}
		}
	}

}
