public class Input {



    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name?");

        String user = userInput.nextLine();
        if(userinput.equals("Alice") || userinput.equals("Bob")) {
            System.out.println("Hi " + user);
        } else {
            System.out.println(" ");
        }
    }
}
