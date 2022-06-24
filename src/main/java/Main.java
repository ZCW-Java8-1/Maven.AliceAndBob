/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");

		String userInput = input.nextLine();

		if(userInput.equalsIgnoreCase("Alice") || userInput.equalsIgnoreCase("Bob")) {
			System.out.println("Hi " + userInput);
		} else {
			System.out.println("Wrong name");
		}
	}
}