import java.util.*;

public class main {
    public static void main(String[]args) {
        
        System.out.print("Enter Number Of employee : ");
        Scanner sc = new Scanner(System.in); // Create Scanner
        int b = sc.nextInt();
        String[] names = new String[b]; // Create list for names
        int[] numbers = new int[b]; // Create list for numbers
        System.out.println("enter name of emplyee and income.");
        for (int i = 0; i < b; i++)names[i] = sc.nextLine();
        for (int i = 0; i < b; i++)numbers[i] = sc.nextInt();
        sc.close(); // Close Scanner

        for (int i = 0; i < b; i++) {
            System.out.print((i + 1) + "- " + names[i] + " Length : " + names[i].length() + " ");
            System.out.println("income : " + (numbers[i] >= 5700000 ? numbers[i] * 1.0165 : numbers[i]));
        }
    }
}
