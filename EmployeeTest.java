/*
Create a class called Employee that includes
three instance variables—a first name (type String), a last name (type
String) and a monthly salary (double). Provide a constructor that
initializes the three instance variables. Provide a set and a get method for
each instance variable. If the monthly salary is not positive, do not set its
value. Write a test app named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display
each object’s yearly salary. Then give each Employee a 10% raise and
display each Employee’s yearly salary again.
*/
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        
        // Create an input object
        Scanner input = new Scanner(System.in);

        // Creating two employees using the Employee constructor
        Employee employee1 = new Employee("Bruce","Wayne",1000000.00);
        Employee employee2 = new Employee("Tony","Stark",150000.00);

        // Testing if salarys are below 0
        if(employee1.getSalary() < 0){
            employee1.setSalary(0.0);
        }

        if(employee2.getSalary() < 0){
            employee2.setSalary(0.0);
        }

        /*
        // Out puting employees names and salaries using the get methods
        System.out.println("The first name is: " + employee1.getFirst());
        System.out.println("The last name is: " + employee1.getLast());
        System.out.println("The salary is: " + employee1.getSalary());

        System.out.println("The first name is: " + employee2.getFirst());
        System.out.println("The last name is: " + employee2.getLast());
        System.out.println("The salary is: " + employee2.getSalary());
        */

        // Calling display method
        displayEmployee(employee1.getFirst(), employee1.getLast(), employee1.getSalary());
        displayEmployee(employee2.getFirst(), employee2.getLast(), employee2.getSalary());

        // Calling method to give salary raise
        giveRaise(employee1.getFirst(), employee1.getSalary());
        giveRaise(employee2.getFirst(), employee2.getSalary());
    }

    public static void displayEmployee(String first, String last, Double salary){
        System.out.println("The first name is: " + first);
        System.out.println("The last name is: " + last);
        System.out.println("The salary is: " + salary);
        System.out.println(); // blank line
    }

    public static void giveRaise(String name, Double salary){

        salary = salary / 10 + salary; //adding 10% to current salary
        System.out.println(name + "'s salary is now " + salary);
        System.out.println(); // blank line
    }
}
