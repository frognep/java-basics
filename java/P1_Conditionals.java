import java.util.Scanner;

public class P1_Conditionals {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message:");

        String userText = scanner.nextLine();

        if (userText.equals("a string")) {
            System.out.println("match!");
        } else {
            System.out.println("not a match");
        }
    }
}
