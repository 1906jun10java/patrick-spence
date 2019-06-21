package CodingChallenge;

import java.util.Scanner;

public class Thursday {

	public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		System.out.println("Enter a String w/ 9 letters: ");
		String str = word.nextLine();
		System.out.println("Enter a letters contained of said String between 4 and 8: ");
		System.out.println("Remember, Java indexes at 0, so 0...8 = 9");
		String substr = word.nextLine();
		
		//String str = "Hamburger";
		//String substr = "urge";
		/*
		int a =str.length();
		int b =str.lastIndexOf(str);

		int c=substr.length();
		int d=substr.lastIndexOf(substr);
		*/
		//System.out.println("The String length is: "+a+" the last index of String is : "+b); 
		//System.out.println("The String length is: "+c+" the last index of String is : "+d); 

		containsSubString(str, substr);
		//System.out.println("Triangle: "+triangle(5));
	}
	public static boolean containsSubString(String str, String substr) {
		if(str.contains(str.substring(4, 8))==(substr.contains(str.substring(4,8)))) {
			System.out.println("The "+substr+" is part of the String, "+str);
			return true;
		}else {
			System.out.println("The "+substr+" is not part of the String, "+str);
			return false;
		}
	}
	public static int triangle(int numbers) {
		if(numbers == 0) {
			return 1; 
		} else { 
			return numbers * triangle(numbers - 1);
			
		}
	}
}

