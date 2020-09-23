
import java.util.Scanner;
/*
5.17 (Calculating Sales) An online retailer sells five products whose retail
prices are as follows: Product 1, $2.98; product 2, $4.50; product 3, $9.98;
product 4, $4.49 and product 5, $6.87. Write an application that reads a
series of pairs of numbers as follows:
1. product number
2. quantity sold
Your program should use a switch statement to determine the retail price
for each product. It should calculate and display the total retail value of all
products sold. Use a sentinel-controlled loop to determine when the
program should stop looping and display the final results.
*/

public class Sales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating new scanner object for user input

        // delcare and initailize variables
        char choice = 'y'; 
        double total = 0;

        do {// do while statement as long as the user enter y or Y at end of loop

            // get user input
            System.out.println("Enter the product number:");
            int productNum = input.nextInt();
            System.out.println("Enter the quantity sold:");
            int quantity = input.nextInt();

            // switch statement testing for product numbers
            switch(productNum){ 
                case 1:
                    total = total + (quantity * 2.98);
                    System.out.println("Total: $" + total);
                    break;

                case 2:
                    total = total + (quantity * 4.50);
                    System.out.println("Total: $" + total);
                    break;

                case 3:
                    total = total + (quantity * 9.98);
                    System.out.println("Total: $" + total);
                    break;

                case 4:
                    total = total + (quantity * 4.49);
                    System.out.println("Total: $" + total);
                    break;
                case 5:
                    total = total + (quantity * 6.87);
                    System.out.println("Total: $" + total);
                    break;

                default:
                    System.out.println("Error: Product number not found"); // if product num is not found then default print this
                    break;
            }

            System.out.println("Would you like to compute more data? (y/n)"); // user for continoue or exit data
            choice = input.next().charAt(0); // allow char to be used

        } while(choice == 'y' || choice == 'Y'); // accepts lowercase and upper case y

        input.close(); // Close input scanner
    }
}