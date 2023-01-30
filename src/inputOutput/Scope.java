package inputOutput;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        // declaring outside of if else statements
        String favoutieFood="Biriyani";
        System.out.println(favoutieFood);
        System.out.println("enter a num btw 1 to 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>5)
        {
            favoutieFood = "Vegan";
            System.out.println(favoutieFood);
        }
        else {
            favoutieFood = "Lol Vegan only";
            System.out.println(favoutieFood);
        }
    }
}
