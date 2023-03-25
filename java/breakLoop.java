import java.util.Scanner;

public class breakLoop {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");
            int userInt = Integer.valueOf(scanner.nextLine());

            if (userInt == 4) {
                break;
            }
        }

        
    
    }
}
