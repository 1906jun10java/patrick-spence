package FizzBuzz;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		//fizzBuzzBasic();
		fizzBuzzAdvanced();
	}
	public static void fizzBuzzBasic() {
		/*
		 * creating an Array, that calls the int values 
		 * 1-100.
		 */ 
		int [] fizzBuzz = new int[100]; //instantiating the array
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			/*
			 * modulus operator is used not to create the array
			 */
			if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else if(i % 3 == 0 || i % 5 == 0)
				if(i % 3 == 0 && i % 5 == 0){
					System.out.println("FizzBuzz");
				}else {
					System.out.println(i+", ");
				}
		}
	}
	public static void fizzBuzzAdvanced() {
		/*
		 * creating an array list of strings, to pass in the arguments
		 * creating an array list of int, to pass in the arguments
		 */
		ArrayList<String> terms = new ArrayList<String>(); //created an arraylist of strings
		terms.add("do");
		terms.add("re");
		terms.add("mi");
		System.out.println(terms);
		String[] s1 = new String[terms.size()]; //converts arraylist to an array
		System.out.println(Arrays.toString(s1));
		

		ArrayList<Integer> num = new ArrayList<Integer>();//created an arraylist of integers 
		num.add(2);
		num.add(5);
		num.add(9);
		System.out.println(num);
		int[] n1 = new int[num.size()]; 
		System.out.println(Arrays.toString(n1));

		for(int i = 1; i <= 100; i++) {
				
				if(i % 2 == 0) {
					System.out.print("do, ");
				}else if(i % 5 == 0) {
					System.out.print("re, ");
				}else if(i % 9 == 0) {
					System.out.print("mi, ");
				}else {
					System.out.print(i+" , ");
				}
			}
		}
	}



