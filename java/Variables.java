import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chicken:");
        int chickenValue = Integer.valueOf(scanner.nextLine());

        System.out.println("Bacon (kg):");
        float baconValue = Float.valueOf(scanner.nextLine());

        System.out.println("Tractor:");
        String Tractor = scanner.nextLine();

        System.out.println(chickenValue);
        System.out.println(baconValue);
        System.out.println(Tractor);
    }
    
}
