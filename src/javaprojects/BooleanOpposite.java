package javaprojects;

import java.util.Scanner;

public class BooleanOpposite {

	public static void main(String[] args) {

		// Creating a scanner object to read the input
		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter a boolean value
		System.out.println(" Enter a boolean value (true/false): ");
		boolean userInput = sc.nextBoolean();
		
		// Display the opposite of the entered boolean value
		boolean Oppositevalue = !userInput;
		System.out.println(" The opposite of true is:" + Oppositevalue);

		sc.close();

	}

}
