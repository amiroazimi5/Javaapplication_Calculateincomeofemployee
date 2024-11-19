import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter Number Of employee: ");
        Scanner sc = new Scanner(System.in); // Create Scanner

        int b = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        String[] names = new String[b]; // Create list for names
        int[] numbers = new int[b]; // Create list for numbers

        System.out.println("Enter name of employee and income:");


        for (int i = 0; i < b; i++) {
            System.out.print("Employee " + (i + 1) + " name: ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < b; i++) {
            System.out.print("Employee " + (i + 1) + " income: ");
            numbers[i] = sc.nextInt();
        }

        sc.close(); // Close Scanner

        for (int i = 0; i < b; i++) {
            System.out.print((i + 1) + "- " + names[i] + " Length: " + names[i].length() + " ");
            System.out.println("income: " + (numbers[i] >= 5700000 ? numbers[i] * 1.0165 : numbers[i]));
        }
    }
}
