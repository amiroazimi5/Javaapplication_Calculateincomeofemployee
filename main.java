import java.util.*;

public class main {
    public static void main(String[] args) {
        //Declares Variables
        String[] names = new String[10];
        int[] numbers = new int[10];

        Scanner sc = new Scanner(System.in);

        //get input from user.
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close(); // Close Scanner

        // Output information
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "- " + names[i] + " Length : " + names[i].length() + " ");
            System.out.println("income : " + (numbers[i] >= 5700000 ? numbers[i] * 1.0165 : numbers[i]));
        }
    }
}
