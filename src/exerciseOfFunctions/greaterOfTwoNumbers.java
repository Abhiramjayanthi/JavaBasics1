package exerciseOfFunctions;
//Write a function which takes in 2 numbers and returns the greater of those two.
public class greaterOfTwoNumbers {
    public static int greatest(int a , int b){
        Math.max(a,b);
        return Math.max(a,b);

    }
    public static void main(String[] args) {
        System.out.println(greatest(2,3));

    }
}
