/*
e an application that reads five
integers and determines and prints the largest and smallest integers in the
group
*/

public class LargestAndSmallest{

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, largest, smallest;
        num1 = 90;
        num2 = -10;
        num3 = 2;
        num4 = 99;
        num5 = 49;
        largest = num1;
        smallest = num2;

        // testing for largest int
        if(num2 > largest){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }

        if(num4 > largest){
            largest = num4;
        }

        if(num5 > largest){
            largest = num5;
        }

        //testing for smasllest int
        if(num2 < smallest){
            smallest = num2;
        }

        if(num3 < smallest){
            smallest = num3;
        }

        if(num4 < smallest){
            smallest = num4;
        }

        if(num5 < smallest){
            smallest = num5;
        }

        //output results
        System.out.printf("The largest int is %d%n", largest);
        System.out.printf("The smallest int is %d%n", smallest);
    }
}