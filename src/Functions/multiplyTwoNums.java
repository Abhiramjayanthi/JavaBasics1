package Functions;

import java.util.Scanner;

public class multiplyTwoNums {
    public static double multiply(double a , double b){
        double mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double input1 = sc.nextDouble();
        System.out.println("Enter the value of b");
        double input2 = sc.nextDouble();
        double multiplication = multiply(input1,input2);
        System.out.println(multiplication);





    }
}
