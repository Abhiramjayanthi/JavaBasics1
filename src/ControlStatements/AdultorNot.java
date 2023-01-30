package ControlStatements;

import java.util.Scanner;

public class AdultorNot {

    public static final int ADULTAGE = 18;

    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age> ADULTAGE){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }

    }
}
