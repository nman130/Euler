package firstFifty;

/*
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class P1 {

	/*
	 * Pretty simple implementation, loops through all numbers 1 to 999 and if the number is
	 * divisible by either 3 or 5, adds it to the cumulative sum, and then prints the result at the end.
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 1000; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);

	}
	
	/*
	 * Alternate implementation, just because. Only adds up multiples of 3 and 5 and then subtracts
	 * multiples of 15 for over-counting. Also returns the solutions instead of printing it.
	 */
	public static int alternateSolution() {
		
		int sum = 0;
		
		for(int i = 3; i < 1000; i += 3) {
			sum += i;
		}
		
		for(int j = 5; j < 1000; j += 5) {
			sum += j;
		}
		
		for(int k = 15; k < 1000; k += 15) {
			sum -= k;
		}
		
		return sum;
	}
	

}
