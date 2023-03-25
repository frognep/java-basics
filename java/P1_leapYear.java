import java.util.Scanner;

public class P1_leapYear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        
        int userYear = Integer.valueOf(scanner.nextLine());

        // A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, 
        // then it is a leap year only when it is also divisible by 400.
        // 1800 = not a leap year

        // layering conditionals
        if (userYear % 100 == 0) {
            if (userYear % 400 == 0) {
                System.out.println("is a leap year");
            } else {
                System.out.println("not a leap year");
            };
        } else if (userYear % 4 == 0) {
            System.out.println("is a leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
