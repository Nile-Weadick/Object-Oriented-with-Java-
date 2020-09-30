/*
Define a method hypotenuse that calculates the
 length of the hypotenuse of a right triangle
when the lengths of the other two sides are given. 
(Use the sample data in Fig. 6.26.) The method
should take two arguments of type double and return
 the hypotenuse as a double. Incorporate this
method into an application that reads values for 
side1 and side2 and performs the calculation with
the hypotenuse method. 
*/

import java.util.Scanner;
public class Triangle {

    double side1, side2; //Triangle object attributes

    public static void main(String[] args) {
        String choice = "y"; // variable for continoue do-while statement
        Scanner input = new Scanner(System.in); // new scanner object
        Triangle newTriangle = new Triangle(); //creating a new triangle object

        do{ 
            System.out.println("Enter side one"); //ask user for input
            newTriangle.setSide1(input.nextDouble()); //set input to object side1

            while(newTriangle.getSide1() <= 0){ //ensure side1 is above 0 & use.get to return side1 from object;
                System.out.println("Value nust be above zero");
                System.out.println("Enter side one");
                newTriangle.setSide1(input.nextDouble());
            }

            System.out.println("Enter side two");
            newTriangle.setSide2(input.nextDouble()); //set input to object side2

            while(newTriangle.getSide2() <= 0){
                System.out.println("Value nust be above zero");
                System.out.println("Enter side two");
                newTriangle.setSide2(input.nextDouble());
            }

            System.out.println("Hypotenuse is: " + calcHypotenuse(newTriangle.getSide1(), newTriangle.getSide2())); // call method to calc hypotenuse and calculate objects hyoptenuse

            System.out.println("Would you like to preform another calculation? (y/n)"); // get user input if another calc is desired
            choice = input.next(); 

        }while(choice.equalsIgnoreCase("y")); // if user enter anyesle but y then the program will termiminate

        input.close(); // close scanner object
    }

    public void setSide1(double side1) { // setter for side1
        this.side1 = side1;
    }

    public void setSide2(double side2) { // setter for side2
        this.side2 = side2;
    }

    public double getSide1() { // return side1
        return side1;
    }

    public double getSide2() { //return side2
        return side2;
    }
    
    public static double calcHypotenuse(double one, double two) {
        double hypotenuse = Math.sqrt(Math.pow(one, 2) + Math.pow(two, 2)); //calc hypotneuse and return result;
        return hypotenuse;
    }
}
