import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {

    // Creating a new formating object to round the output to 2 decimal places
    DecimalFormat df = new DecimalFormat("###.##");

    // To test the class designed above
    //Instantiate 2 saving account objects saver1 and saver2
    SavingsAccount saver1, saver2;
    saver1 = new SavingsAccount (2000.0);
    saver2= new SavingsAccount (3000.0);

    //Set the annual interest rate to 4%=0.04
    SavingsAccount.modifyInterestRate (0.04);

    //Calculate monthly interest 
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();

    //Print out the new balances for both savers
    System.out.println("This month:\nSaver 1 balance= " + df.format(saver1.getSavingBalance()));
    System.out.println("Saver 2 balance= "+ df.format(saver2.getSavingBalance()));


    //Change annual interest rate to 5%=0.05
    SavingsAccount.modifyInterestRate(0.05);

    //Calculate the next month interest rate and print out balances
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("Next month:\nSaver 1 balance= "+ df.format(saver1.getSavingBalance()));
    System.out.println("Saver 2 balance= "+ df.format(saver2.getSavingBalance()));
    
    }
}
