package inputOutput;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>5)
        {
            System.out.println("Enjoy the good luck a friend brings you");
        }
        else {
            System.out.println("Your shoe selection will make you happy today");
        }
    }
}
