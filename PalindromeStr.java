import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		Scanner phrase = new Scanner(System.in); //creates a scanner object 
		System.out.println("Enter a Palindrome: "); 
		String palindrome = phrase.nextLine(); //user enters the palindrome 
		System.out.println("You've entered: "+palindrome);

		//int a = palindrome.length(); //defines the length of the palindrome 
		//System.out.println(a);


		System.out.println(reverse(palindrome));
	}

	public static String reverse(String palindrome) {
		String input = palindrome; //palindrome input 
		String output = " "; 
	
		int a = 7;
		if(palindrome.length() == a) { //if the palindrome length is equal to 7
			for(int i = palindrome.length() - 1; i >= 0; i--) {//to write the palindrome in reverse 
				output = output + palindrome.charAt(i); 
			}
			System.out.println(output+", which is "+palindrome+" reversed. A palindrome.");	
			/*
		} else if (palindrome.charAt(i) = output) {//if the entered input isn't a palindrome 
			System.out.println("Enter a new Palindrome: ");
			Scanner phrase2 = new Scanner(System.in);
			String palindrome2 = phrase2.nextLine();t
			System.out.println("You've Entered: "+palindrome2);
			*/
		}else {
				System.out.println(palindrome+" is not a palindrome, and your program has been terminated!");
			}
		return " ";
	}
}

