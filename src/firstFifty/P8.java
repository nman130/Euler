package firstFifty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * (Number in P8Helper.txt)
 */

public class P8 {

	/*
	 * This solution is a one-pass where the number is scanned from right to left. For each new number encountered,
	 * the running product is divided by the end of the 13-digit sequence and then multiplied by the new beginning.
	 * The maximum product is then updated.
	 */
	public static void main(String[] args) {
		
		Scanner sc;
		
		try {
			sc = new Scanner(new File("P8Helper.txt"));
		} catch (FileNotFoundException e) {
			sc = null;
			System.out.println("How did you get here?");
		}
		
		//Variable set-up
		String input = sc.next();
		int inputLength = input.length();
		long maxProduct = 1;
		long currProduct = 0;
		int currIndex = 13;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int nextDigit;
		int prevDigit;
		
		//Initializing the first product
		for(int i = 0; i < 13; i++) {
			
			nextDigit = Character.getNumericValue(input.charAt(i));
			maxProduct *= nextDigit;
			queue.add(nextDigit);
			
		}
		
		currProduct = maxProduct;
		
		//Implement a sliding window to find other products
		while(currIndex < inputLength) {
			
			nextDigit = Character.getNumericValue(input.charAt(currIndex));
			prevDigit = queue.poll();
			
			//Reset the product on a 0
			if(prevDigit == 0) {
				currProduct = 1;
				for(int num : queue) {
					currProduct *= num;
				}
			//Otherwise just update the product
			} else {
				currProduct /= prevDigit;
			}
			
			currProduct *= nextDigit;
			queue.add(nextDigit);
			maxProduct = Math.max(currProduct, maxProduct);
			currIndex++;
		}

		System.out.println(maxProduct);
		
	}

}
