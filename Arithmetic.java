/*
an application that asks the user to enter two
integers, obtains them from the user and prints their sum, product,
difference and quotient (division).
*/

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //scanner to obatin inpouter from user

        System.out.println("Enter first Integer"); //get num1
        int num1 = input.nextInt();
        System.out.println("Enter first Integer"); //get num2
        int num2 = input.nextInt();
        
        int sum = num1 + num2; // add nums
        int difference = num1 - num2; // subtract nums
        int quotient = num1 / num2; // divide nums

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The difference is %d%n", difference);
        System.out.printf("The quotient is %d%n", quotient);
    }
    
}