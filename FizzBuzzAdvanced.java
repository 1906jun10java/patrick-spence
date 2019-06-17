package FizzBuzz;
import java.util.ArrayList;

public class FizzBuzzAdvanced {

	//creating the instance variables
	int m = 1; 
	int n = 100;

	public void fizzBuzzAdvanced() {
		/*
		 * creating an array list of strings, to pass in the arguments
		 * creating an array list of int, to pass in the arguments
		 *
		ArrayList<String> terms = new ArrayList<String>();
		terms.add("do");
		terms.add("re");
		terms.add("mi");
		*/
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(9);

		for(int i = 1; i <= 100; i++) { 
			if(i % 2 == 0) {
				System.out.println("do");
			}else if(i % 5 == 0) {
				System.out.println("re");
			}else if(i % 9 == 0) {
				System.out.println("mi");
			}else {
				System.out.println(i+" , ");
			}
		}
	}
}