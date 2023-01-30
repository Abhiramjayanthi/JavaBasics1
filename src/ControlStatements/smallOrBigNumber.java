package ControlStatements;

import java.util.Scanner;

public class smallOrBigNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("A is equal to B");
        } else if (a>b) {
            System.out.println("A is greater than B");

        }
        else{
            System.out.println("B is greater than A");
        }
    }
}
