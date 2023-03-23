import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInt = Integer.valueOf(scanner.nextLine());

        if (userInt % 3 == 0 && userInt % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (userInt % 3 == 0) {
            System.out.println("Fizz");
        } else if (userInt % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(userInt);
        }
    }       
}
