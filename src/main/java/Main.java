/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
	Scanner userInputNext = new Scanner(System.in);

	Condition(userInput);

    }

	static void Condition(Scanner userInput) {
	if(userInput.equals("Alice") || userInput.equals("Bob")){
	String name = userInput.nextLine();
	System.out.println("Name is: " + name);
		
	}
	
}

}
