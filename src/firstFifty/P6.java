package firstFifty;

/*
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class P6 {

	/*
	 * Brute-force method: Simply sum all 100 numbers and their squares separately and then take the difference.
	 */
	public static void main(String[] args) {
		
		int sumSquares = 0;
		int squareSum = 0;
		
		for(int i = 1; i < 101; i++) {
			sumSquares += i * i;
			squareSum += i;
		}

		System.out.println((squareSum * squareSum) - sumSquares);
		
	}

	/*
	 * A more clever solution would involve finding a formula for each sum and using those,
	 * but that's less what I'm trying to get out of these exercises (though it is admittedly
	 * a fun challenge).
	 */
	
}
