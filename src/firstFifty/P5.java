package firstFifty;

/*
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class P5 {
	
	/*
	 * Frankly, this one is much more easily solved when you think about what it means to be divisible
	 * by all numbers 1-20. Every prime's highest power under twenty must divide the number, and since
	 * those are all obviously coprime with each other, their LCM is simply their product.
	 */
	public static void main(String[] args) {
		
		System.out.println(16*9*5*7*11*13*17*19);
		
	}

}
