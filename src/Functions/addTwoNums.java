package Functions;

import java.util.Scanner;

public class addTwoNums {
    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        int add=sum(a,b);
        System.out.println("The sum of a and b is "+add);
    }
}
