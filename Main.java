/*
* Jorge Delgado
* CEN4802
* */

import java.util.Scanner;

public class Main {

     /*
     Fibonacci Method:
     Determines the nth term in the Fibonacci Sequence
     *------------------------------------------------------------------------------------------------------------------ */
     public static int fibonacci(int n) {
          if (n <= 1) {
               return n;
          }
          return fibonacci(n - 1) + fibonacci(n - 2);
     }

     //Main Method:-----------------------------------------------------------------------------------------------------
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int n = sc.nextInt();
          int result = fibonacci(n);


          System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
     }

}
