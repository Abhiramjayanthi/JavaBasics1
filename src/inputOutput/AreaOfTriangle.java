package inputOutput;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base of triangle");
        int base = sc.nextInt();
        System.out.println("Enter the value of height of triangle");
        int height = sc.nextInt();
        area = (base*height)/2;
        System.out.println("The area of the triangle is "+area);

    }
}
