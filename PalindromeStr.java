import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		Scanner phrase = new Scanner(System.in); // creates a scanner object
		System.out.println("Enter a Palindrome: ");
		String palindrome = phrase.nextLine(); // user enters the palindrome
		System.out.println("You've entered: " +palindrome);

		// int a = palindrome.length(); //defines the length of the palindrome
		// System.out.println(a);
		phrase.close();

		reverse(palindrome);
		//PalindromeStr.Boolean(palindrome);
	}


	public static String reverse(String palindrome) {
		// String input = " "; //palindrome input
		String output = " ";
		for (int p = palindrome.length() - 1; p >= 0; p--) {
			output = output + palindrome.charAt(p);
		}
	
	

	//public static void Boolean(String palindrome) {
	if ((output.substring(0, 8)==(output.substring(0, 8)))) {  //used the substring method to construct if the word is a palindrome
		/*
		 * with the beginning index set at 0 and the ending set at 6, since 0 is the starting position and 8 spaces will equal 9
		 * the output would run, equating the values of the string between those indexes 
		 * granted there not below the index length
		 */
			System.out.println(output+", which is reversed. A palindrom.");
		/*
		 * only issue is, with words that are 7 integers long, the code will read it as a palindrome
		 * which is incorrect
		 */
		}else {
			System.out.println(output+" is not a palindrome, and your program has been terminated!");

		}
		return output;
	}

}


/*
 * } else if (palindrome.charAt(i) = output) {//if the entered input isn't a
 * palindrome System.out.println("Enter a new Palindrome: "); Scanner phrase2 =
 * new Scanner(System.in); String palindrome2 = phrase2.nextLine();t
 * System.out.println("You've Entered: "+palindrome2);
 */
