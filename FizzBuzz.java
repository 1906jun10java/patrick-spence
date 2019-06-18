package FizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {

	public static void fizzBuzzBasic() {

		for (int i = 1; i <= 100; i++) {
			/*
			 * modulus operator is used not to create the array
			 */
			if(i % 15 == 0) {
				System.out.print("Fizzbuzz, ");
			}else if(i % 5 == 0) {
				System.out.print("Buzz, ");
			}else if(i % 3 == 0){
				System.out.print("Fizz, ");
			}else {
				System.out.print(i+", ");
			}
		}
	}

}









