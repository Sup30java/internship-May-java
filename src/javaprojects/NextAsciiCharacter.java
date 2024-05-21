package javaprojects;

import java.util.Scanner;

public class NextAsciiCharacter {

	public static void main(String[] args) {
		// Creating a scanner object to read the input

		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter a single character

		System.out.println("Enter a Single character: ");
		char inputchar = sc.next().charAt(0);

		// Display the next character in the ASCII sequence

		char nextchar = (char) (inputchar + 1);
		System.out.println("The next character after '" + inputchar + "' is: " + nextchar);
		sc.close();
	}

}
