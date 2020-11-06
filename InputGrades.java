import java.util.Scanner;

public class InputGrades{

    public static void main(String[] args){
        //Create a new scanner object 
        Scanner input = new Scanner(System.in);

        //Local variables
        String grade;
        int creditHours;
        String courseID;
        int count = 1;

        for(int h = 0; h < 10; h++){

            //create new student object
            Student S = new Student();

            //get student ID
            System.out.printf("Enter ID for Student ");
            System.out.println(count);
            int studentID = input.nextInt();

            // add 5 courses to Student courses array
            for(int i = 0; i <= 4; i++){

                //get user data for courseID, creditHours, and grade
                System.out.println("Enter Course ID:");
                courseID = input.next();
                System.out.println("Enter Credit Hours:");
                creditHours = input.nextInt();
                System.out.println("Enter Grade:");
                grade = input.next();

                // Test for invalid grade data
                while(!grade.equals("A") && !grade.equals("B") && !grade.equals("C") && !grade.equals("D") && !grade.equals("F")){
                    System.out.println("Grade must be A, B, C, D,or F");
                    System.out.println("Enter Grade:");
                    grade = input.next();
                }  

                // create new CollegeCourse object using the users data
                CollegeCourse C = new CollegeCourse(courseID, creditHours, grade);

                // append the College COurse object to Student CC Array to index
                S.courses[i] = C;
            }

            count++;

            //Output Student ID for grade report
            S.setID(studentID);
            System.out.println("************************");
            System.out.printf("Student: ");
            System.out.println( S.getID());
            System.out.println("************************");

            //Out grades for all 5 Students courses
            for(int i = 0; i <= 4; i++){
                System.out.printf("Course ID: ");
                System.out.println(S.courses[i].getCourseId());
                System.out.printf("Credit Hours: ");
                System.out.println(S.courses[i].getHours());
                System.out.printf("Grade: ");
                System.out.println(S.courses[i].getGrade());
                System.out.println("************************");
            }
        }
    }
}
