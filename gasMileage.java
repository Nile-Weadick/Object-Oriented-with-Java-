/*
Drivers are concerned with the mileage their
automobiles get. One driver has kept track of several trips by recording the
miles driven and gallons used for each tankful. Develop a Java application
that will input the miles driven and gallons used (both as integers) for each
trip. The program should calculate and display the miles per gallon
obtained for each trip and print the combined miles per gallon obtained for
all trips up to this point. All averaging calculations should produce
floating-point results. Use class Scanner and sentinel-controlled
iteration to obtain the data from the user.
*/

/*

Formulate the algorithm

Define and get what variables will be used for calculation
Assign input form user to variables
Use variables to calculate MPG
display results
ask user if they want to calc the MPG again
if user says yes then a cumalive MPG is calculated
*/

import java.util.Scanner;

public class gasMileage {

    public static void main(String[] args) {

        // for user input
        Scanner input = new Scanner(System.in);

        // declare variables
        float result, newResult;
        int miles, gallons;
        String userInput;

        // get user input
        System.out.println("Enter miles driven:");
        miles = input.nextInt();
        System.out.println("Enter gallons used:");
        gallons = input.nextInt();

        // calculate results
        result = miles / gallons;
        newResult = result; // set result to newResult for cumultive 

        // output current result
        System.out.println("The miles per gallon is: " + result);

        // ask use if they want to continoue
        System.out.println("Would you like to compute more data? (Y/N)");
        userInput = input.next();

        do{

        System.out.println("Enter miles driven:");
        miles = input.nextInt();
        System.out.println("Enter gallons used:");
        gallons = input.nextInt();

        result = miles / gallons;
        result = result + newResult; // cumulitve MPG results
        newResult = result;

        System.out.println("The cumulative miles per gallon is: " + result);

        System.out.println("Would you like to compute more data? (Y/N)");
        userInput = input.next();

        }while(userInput.equalsIgnoreCase("y")); //as long as the user enters a Y or y the loop will execute again

        input.close(); // close input
    }
}
