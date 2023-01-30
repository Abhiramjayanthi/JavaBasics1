package Functions;
/* a block of code which is reusable
functions are two types user defined and system defined and functionName should not be
system defined.
public static returnType functionName(typearg1,typearg2...){
operations
}
 */

import java.util.Scanner;

//Print a given name in function.
public class basicOfFunctions {
    public static void printName(String name){

        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the name which you wanted to print:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);

    }
}
