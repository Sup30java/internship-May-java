package javaprojects;

import java.util.Scanner;

public class Multiplyby2 {

	public static void main(String[] args) {

		// Creating a scanner object to read the input
		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter floating integer
		System.out.println("Enter a floating-point number:");
		float number = sc.nextFloat();

		// Multiply the floating-point number by 2
		float result = number * 2;

		// display the result
		System.out.println(number + " multiplied by 2 is:" + result);
		sc.close();
	}

}
