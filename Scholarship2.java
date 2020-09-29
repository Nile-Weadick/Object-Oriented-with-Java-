/*
Moberly Area Community College offers scholarships to local high school 
students who meet any of several criteria. Write an application that prompts 
the user for a student’s numeric high school grade point average (for example, 3.2), 
the student’s number of extracurricular activities, and the student’s number of service 
activities. Display the message "Scholarship candidate" if the student has any of the following:

- A grade point average of 3.8 or above and at least one extracurricular activity and one service activity

- A grade point average below 3.8 but at least 3.4 and a total of at least three extracurricular and service activities

- A grade point average below 3.4 but at least 3.0 and at least two extracurricular activities and three service activities

Modify the Scholarship application so that if a user enters a grade point average under 0 or over 4.0, 
or a negative value for either of the activities, an error message appears. Save the file as Scholarship2.java.
*/

import java.util.Scanner;
public class Scholarship2{
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in); // Create new scanner object

       // Get user input
       System.out.println("Enter high school grade point average");
       double GPA = input.nextDouble();

       while(GPA > 4.0 || GPA <= 0){ // Ensureing GPA is between 0 & 4.0, otherwise user must re-enter
           System.out.println("GPA must be between 0 - 4.0");
           System.out.println("Enter high school grade point average");
           GPA = input.nextDouble();
       }
       System.out.println("Enter number of extracurricular activities");
       int extActivities = input.nextInt();
       System.out.println("Enter number of service activities");
       int serActivities = input.nextInt();

    if(GPA >= 3.8 && extActivities >= 1 && serActivities >= 1){ // test if GPA is greater or eqaul to 3.8 and at least 1 in each activities
        System.out.println("Scholarship candidate");
    }

    else if(GPA < 3.8 && GPA >= 3.4 && (extActivities + serActivities) >= 3){ //test GPA for greater t han 3.4 and activies are totaled as 3 or higher
        System.out.println("Scholarship candidate");
    }

    else if(GPA < 3.4 && GPA >= 3.0 && extActivities >= 3 && serActivities >= 2){ // test if GPA is above 3.0 and 3 extActivies and 2 serActivities
        System.out.println("Scholarship candidate");
    }
    
    else{
        System.out.println("Not a candidate.");
    }
    input.close(); // close scanner
   }
}

