import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Which animal would you like to see: a dog or a cat?");
            System.out.print("Enter your choice: ");
            userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("dog")) {
                System.out.println("^..^      /\r\n" + //
                                        "/_/\\_____/\r\n" + //
                                        "   /\\   /\\\r\n" + //
                                        "  /  \\ /  \\");
                isValidInput = true;
            } else if (userInput.equals("cat")) {
                System.out.println("|\\---/|\r\n" + //
                                        "| o_o |\r\n" + //
                                        " \\_^_/\r\n" + //
                                        "");
                isValidInput = true;
            } else {
                System.out.println("Invalid option. Please choose between dog or cat");
            }
        }
        
        scanner.close();
    }
}


