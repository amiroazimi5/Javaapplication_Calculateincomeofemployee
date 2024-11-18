import java.util.*;

public class main {
    public static void main(String[] args) {
      //Declares Variables
      String name1 , name2 , name3 , name4 , name5 , name6 , name7 , name8 , name9 , name10;
      int number1 , number2 , number3 , number4 , number5 , number6 , number7 , number8 , number9 , number10;
      
      Scanner sc = new Scanner (System.in);

      //get input from user.
      name1 = sc.nextLine();
      name2 = sc.nextLine();
      name3 = sc.nextLine();
      name4 = sc.nextLine();
      name5 = sc.nextLine();
      name6 = sc.nextLine();
      name7 = sc.nextLine();
      name8 = sc.nextLine();
      name9 = sc.nextLine();
      name10 = sc.nextLine();
      number1 = sc.nextInt();
      number2 = sc.nextInt();
      number3 = sc.nextInt();
      number4 = sc.nextInt();
      number5 = sc.nextInt();
      number6 = sc.nextInt();
      number7 = sc.nextInt();
      number8 = sc.nextInt();
      number9 = sc.nextInt();
      number10 = sc.nextInt();

      sc.close();/* Close Scanner */

      // Output information
      System.out.print("1- " + name1 + " Length : " + name1.length() + " ");
      if (number1 >= 5700000) System.out.println("income : " + (number1*1.0165));
      else System.out.println("income : " + number1);

      System.out.print("2- " + name2 + " Length : " + name2.length() + " ");
      if (number2 >= 5700000) System.out.println("income : " + (number2*1.0165));
      else System.out.println("income : " + number2);

      System.out.print("3- " + name3 + " Length : " + name3.length() + " ");
      if (number3 >= 5700000) System.out.println("income : " + (number3*1.0165));
      else System.out.println("income : " + number3);

      System.out.print("4- " + name4 + " Length : " + name4.length() + " ");
      if (number4 >= 5700000) System.out.println("income : " + (number4*1.0165));
      else System.out.println("income : " + number4);

      System.out.print("5- " + name5 + " Length : " + name5.length() + " ");
      if (number5 >= 5700000) System.out.println("income : " + (number5*1.0165));
      else System.out.println("income : " + number5);

      System.out.print("6- " + name6 + " Length : " + name6.length() + " ");
      if (number6 >= 5700000) System.out.println("income : " + (number6*1.0165));
      else System.out.println("income : " + number6);

      System.out.print("7- " + name7 + " Length : " + name7.length() + " ");
      if (number7 >= 5700000) System.out.println("income : " + (number7*1.0165));
      else System.out.println("income : " + number7);

      System.out.print("8- " + name8 + " Length : " + name8.length() + " ");
      if (number8 >= 5700000) System.out.println("income : " + (number8*1.0165));
      else System.out.println("income : " + number8);

      System.out.print("9- " + name9 + " Length : " + name9.length() + " ");
      if (number9 >= 5700000) System.out.println("income : " + (number9*1.0165));
      else System.out.println("income : " + number9);

      System.out.print("10- " + name10 + " Length : " + name10.length() + " ");
      if (number10 >= 5700000) System.out.println("income : " + (number10*1.0165));
      else System.out.println("income : " + number10);
}}