
package ControlStatements;
import java.util.Scanner;

/**
 * adult is the class and it is starting class
 */
public class adult {

    /**
     * this is the main method for the program
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("enter your age");
        /**
         * this is scanner class used for input and output from user
         */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /**
         * checking whether user is greater than 18 or not
         */
        if(age> 18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}
