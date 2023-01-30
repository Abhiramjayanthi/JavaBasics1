package exerciseOfFunctions;

import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average
public class average {
    public static double avg(double a , double b, double c){
        double z = (a+b+c)/2;
        return z;
    }
    public static void main(String[] args) {
        //System.out.println("The Average of 3 numbers"+avg(2,2,2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        double a = sc.nextDouble();
        System.out.println("Enter the value of B");
        double b = sc.nextDouble();
        System.out.println("Enter the value of C");
        double c = sc.nextDouble();
        System.out.println("The Average of 3 numbers"+avg(a,b,c));


    }
}
