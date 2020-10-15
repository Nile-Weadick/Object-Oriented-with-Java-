/*
7.19 (Airline Reservations System) A small airline has just purchased a
computer for its new automated reservations system. You’ve been asked to
develop the new system. You’re to write an application to assign seats on
each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please
type 1 for First Class and Please type 2 for
Economy. If the user types 1, your application should assign a seat in the
first-class section (seats 1–5). If the user types 2, your application should
assign a seat in the economy section (seats 6–10). Your application should
then display a boarding pass indicating the person’s seat number and
whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the
seating chart of the plane. Initialize all the elements of the array to false
to indicate that all the seats are empty. As each seat is assigned, set the
corresponding element of the array to true to indicate that the seat is no
longer available.
Your application should never assign a seat that has already been assigned.
When the economy section is full, your application should ask the person
if it’s acceptable to be placed in the first-class section (and vice versa). If
yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
*/

import java.util.Scanner;
public class ARS{

    Scanner input = new Scanner(System.in);
        public static void main(String[] args) {

        //boolean seatsBooked;
        boolean arrSeats[];
        int CAPACITY = 11;
        int availSeats = CAPACITY;
        Scanner input;
        int userChoice;
        int current;
        arrSeats = new boolean[CAPACITY]; // Create boolean array of seats
        String userInput, seatClass;
        input = new Scanner(System.in); // Create Scanner

        // set all seats to false;
        for (int i = 0; i < arrSeats.length; i++) {
            arrSeats[i] = false;
        }

        do{
            printMenu(); // call print menu method

        userChoice = input.nextInt();// ask user for class choice

        // if user enter invlaid re prompt
        while (userChoice != 1 && userChoice != 2) {
            printMenu();
            userChoice = input.nextInt();
        }

        if(userChoice == 1){
            
            for (current = 1; current <= 5; current++) {

                if (arrSeats[current] == false) {
                    arrSeats[current] = true;
                    availSeats--;
                    //seatsBooked = true;

                    seatClass = "First Class";
    
                    printBoardPass(current, seatClass);
    
                    break;
                }
            }

            if(current > 5){
                System.out.println("First class is full");

                if(availSeats <= 0){
                    System.out.println("Next flight leaves in 3 hours.");
                    return;
                }

                System.out.println("Would you like to move to Economny? (Y/N)");
                String moveCustomer = input.next();

                if(moveCustomer.equalsIgnoreCase("y")){

                    for (current = 6; current <= 10; current++) {
    
                        if (arrSeats[current] == false) {
                            arrSeats[current] = true;
                            availSeats--;
                            //seatsBooked = true;
                            seatClass = "Economy Class";
            
                            printBoardPass(current, seatClass);
            
                            break;
                        }
                    }
    
                    if(current > 10){
                        System.out.println("Economy class is full");
                        System.out.println("Next flight leaves in 3 hours.");
                        return;
                    }
                }
            }
        }

            if(userChoice == 2){
    
                for (current = 6; current <= 10; current++) {
    
                    if (arrSeats[current] == false) {
                        arrSeats[current] = true;
                        availSeats--;
                        //seatsBooked = true;
                        seatClass = "Economy Class";
        
                        printBoardPass(current, seatClass);
        
                        break;
                    }
                }

                if(current > 10){ // econ class is full

                    System.out.println("Economy class is full");

                    System.out.println("Would you like to move to First class? (Y/N)");
                    String moveCustomer = input.next();

                    // move to first class
                    if(moveCustomer.equalsIgnoreCase("y")){

                        for (current = 1; current <= 5; current++) {

                            if (arrSeats[current] == false) {
                                arrSeats[current] = true;
                                availSeats--;
                                //seatsBooked = true;
            
                                seatClass = "First Class";
                
                                printBoardPass(current, seatClass);
                
                                break;
                            }
                        }

                        if(current > 5){
                            System.out.println("First class is full");
                            System.out.println("Next flight leaves in 3 hours.");
                            return;
                        }
                    }
                }
            }

            System.out.println("Would you like to book more seats? (Y/N)");
            userInput = input.next();

        }while(userInput.equalsIgnoreCase("y")); 

        input.close(); //close scanner
    }
    
    // Simple sysout printlns
    public static void printMenu(){
        System.out.println("***** Airline Reservation System *****");
        System.out.println(" Menu Options ");
        System.out.println(" 1 - First Class ");
        System.out.println(" 2 - Economy Class ");
        System.out.println("**************************************");
        System.out.println("Please choose your option: ");
    }

    //Print boarding pass method
    public static void printBoardPass(int x, String section){ // pass seat number and first or economy class
        System.out.println("***** Boarding Pass *****");
        System.out.println(section);
        System.out.println("Seat Number: " + x);
    }
}