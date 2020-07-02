package firstFifty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 * (Numbers in P11Helper.txt)
 */

public class P11 {

	/*
	 * Loops through the array and for each index, finds the products that contain it that
	 * haven't already been found and updates the max product if necessary.
	 */
	public static void main(String[] args) {
		
		int[][] numbers = getNumbers();
		int maxProduct = 0;
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				
				if(i < 17 && j < 17) {
					maxProduct = Math.max(maxProduct, calcProduct(numbers, i, j, 1, 1));
				}
				if(i > 2 && j < 17) {
					maxProduct = Math.max(maxProduct, calcProduct(numbers, i, j, -1, 1));
				}
				if(i < 17) {
					maxProduct = Math.max(maxProduct, calcProduct(numbers, i, j, 1, 0));
				}
				if(j < 17) {
					maxProduct = Math.max(maxProduct, calcProduct(numbers, i, j, 0, 1));
				}
			}
		}
		System.out.println(maxProduct);
	}
	
	/*
	 * Calculates the product of the four numbers at the indices specified in the input.
	 */
	private static int calcProduct(int[][] numbers, int i, int j, int xChange, int yChange) {
		int product = 1;
		for(int temp = 0; temp < 4; temp++) {
			product *= numbers[i][j];
			i += xChange;
			j += yChange;
		}
		return product;
	}
	
	/*
	 * Gets the numbers from the helper file.
	 */
	private static int[][] getNumbers(){
		
		Scanner sc;
		
		try {
			sc = new Scanner(new File("P11Helper.txt"));
		} catch (FileNotFoundException e) {
			sc = null;
			System.out.println("How did you get here?");
		}
		
		int[][] output = new int[20][20];
		String[] nextLine;
		
		for(int i = 0; i < 20; i++) {
			
			nextLine = sc.nextLine().split("\\s+");
			
			for(int j = 0; j < 20; j++) {
				
				output[i][j] = Integer.parseInt(nextLine[j]);
				
			}
			
		}
		
		return output;
	}
	
	

}
