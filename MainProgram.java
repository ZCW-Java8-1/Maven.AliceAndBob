import java.util.Scanner;

/**
 * Write a description of class MainProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainProgram
{
    // instance variables - replace the example below with your own
    
    public String input;
    /**
     * Constructor for objects of class MainProgram
     */
    public MainProgram()
    {
        // initialise instance variables
        requestInput(); //This one gets input from user and stores it
        processInput(); //This one checks if input is Alice or Bob, if so, greet
        
    }

    public void requestInput(){
        Scanner myScanner = new Scanner(System.in);
        input = myScanner.nextLine();
        
    }
    
    public void processInput(){
        if (input.equals( "Alice") || input.equals("Bob")){
            greet();
        }
        
        
    }
    
    public void greet(){
        System.out.println("Hello, " + input + " how are you today?");
        
    }
    
}
   