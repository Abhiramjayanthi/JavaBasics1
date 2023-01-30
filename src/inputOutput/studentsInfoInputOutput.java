package inputOutput;

import java.util.Scanner;

public class studentsInfoInputOutput {
    public static void main(String[] args) {
        System.out.println("Enter the Student GPA");
        Scanner sc = new Scanner(System.in);
        double studentGPA = sc.nextDouble();
        System.out.println("The student got total of "+studentGPA+" "+" GPA");


    }
}
