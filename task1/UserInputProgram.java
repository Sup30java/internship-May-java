package com.task1;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {

		// Creating a scanner object to read the input
		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter first integer
		System.out.println("Enter the first integer is: ");
		int num1 = sc.nextInt();
		// Prompts the user to enter second integer
		System.out.println("Enter the second integer is: ");
		int num2 = sc.nextInt();
		// Prompts the user to enter floating integer
		System.out.println("Enter a floating-point number:");
		float number = sc.nextFloat();
		// Prompts the user to enter a single character
		System.out.println("Enter a Single character: ");
		char inputchar = sc.next().charAt(0);
		// Prompts the user to enter a boolean value
		System.out.println("Enter a boolean value (true/false): ");
		boolean userInput = sc.nextBoolean();
		// Prompts the user to enter their name
		System.out.println("Enter your name: ");

		// Consume the newline left-over
		sc.nextLine();

		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		float result = number * 2;
		char nextchar = (char) (inputchar + 1);
		boolean Oppositevalue = !userInput;
		String name = sc.nextLine();

		System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
		System.out.println("Difference between " + num1 + " and " + num2 + " is : " + difference);
		System.out.println("Product of " + num1 + " and " + num2 + " is : " + product);
		System.out.println(number + " multiplied by 2 is: " + result);
		System.out.println("The next character after '" + inputchar + "' is: " + nextchar);
		System.out.println("The opposite of true is: " + Oppositevalue);
		System.out.println("Hello," + name + "! ");
		sc.close();

	}

}
