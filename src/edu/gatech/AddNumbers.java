package edu.gatech;

public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// parse two numers from system args
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// Add the numbers
		int sum = a+b;
		
		// Print the result
		System.out.println(a + "+" + b + "=" + sum);

	}

}
