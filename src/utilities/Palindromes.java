package utilities;

/*
 * For methods concerning palindromic numbers.
 */

public class Palindromes {

	/*
	 * Determines whether the input int is a palindrome.
	 * Reverses the number and then checks if the number is the same as its reverse.
	 * Will cause an issue if the reversed number exceeds the int limit.
	 */
	public static boolean isPalindrome(int num) {
		
		int originalNum = num;
		int reversedNum = 0;
		
		while(num != 0) {
			reversedNum *= 10;
			reversedNum += num % 10;
			num /= 10;
		}
		
		return originalNum == reversedNum;
		
	}
	
	
}
