package javaprojects;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {

		// Creating a scanner object to read the input
		Scanner sc = new Scanner(System.in);

		// Prompts the user to enter their name
		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		// Display a greeting message that includes the user's name
		System.out.println(" hello," + name + "! ");
		sc.close();
	}

}
