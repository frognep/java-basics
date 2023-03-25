import java.util.Scanner;

public class P2_Loops {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int userSum = 0;
        int loopCount = 0;
        while (true) {
            if (loopCount == 5) {
                break;
            }
            System.out.println("Enter a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            userSum += userNum;
            loopCount += 1;
        }

        System.out.println("Your sum is " + userSum);
    }
}
