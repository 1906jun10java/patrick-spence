package FizzBuzz;

public class FizzBuzz {


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

}







