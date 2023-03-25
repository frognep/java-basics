import java.util.Scanner;


public class P1_Strings {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");

        String userInput = scanner.nextLine();

        System.out.println("Your name is " + userInput + ".");
    }
}