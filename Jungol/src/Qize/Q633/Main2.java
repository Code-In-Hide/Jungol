package Qize.Q633;

import java.util.Scanner;

public class Main2 {

   public static void main(String[] args) {
      boolean condition = true;
      while(condition) {
         System.out.println("1. Korea");
         System.out.println("2. USA");
         System.out.println("3. Japan");
         System.out.println("4. China");
         System.out.println("number? ");

         Scanner sc = new Scanner(System.in);

         int capital = sc.nextInt();
         
         switch (capital) {
         case 1:
            System.out.println("Seoul");
            break;
         case 2:
            System.out.println("Washington");
            break;
         case 3:
            System.out.println("Tokyo");
            break;
         case 4:
            System.out.println("Beijing");
            break;
         default:
            sc.close();
            System.out.println("none");
            condition = false;
            break;
         }
      }
   }
}
