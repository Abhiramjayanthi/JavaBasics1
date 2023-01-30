package loops;

import java.util.Scanner;

public class whileDemo {
    public static void main(String[] args) {
        System.out.println("Enter any number between 1 to 10");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {
            System.out.println("Valid number");
            break;


        }

    }
}
