package javaprojects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Creating a scanner object to read the input
		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter first integer
		System.out.println(" Enter the first integer is: ");
		int num1 = sc.nextInt();

		// Prompts the user to enter second integer
		System.out.println(" Enter the second integer is: ");
		int num2 = sc.nextInt();

		// Calculate the sum, difference, and product

		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;

		// display the sum, difference, and product
		System.out.println("Sum of 10 and 20 is: " + sum);
		System.out.println("Difference between 10 and 20 is: " + difference);
		System.out.println("Product of 10 and 20 is" + product);
		sc.close();

	}

}
