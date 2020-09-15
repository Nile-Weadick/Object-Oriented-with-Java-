import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class accountTest {
    public static void main(String[] args){
        // create a Scanner object to obtain input
        Scanner input = new Scanner(System.in);

        // create an Account object and assign it
        account myAccount = new account();

        // display initial value of name (null)
        //System.out.printf("Initial name is ",  s%n%n);

        // prompt for and read name
        System.out.println("Please Enter name: ");
        String theName = input.nextLine();
        myAccount.setName(theName); // put theName into myAccount object
        // display the name stored in object
        System.out.println("Name in object is:");
        System.out.println(myAccount.getName());
    }
}

