package exerciseOfFunctions;
//Write a function to print the sum of all odd numbers from 1 to n.
public class sumOfOdd {
    public static int sumOdd(){
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum = sum + i;

        }
        return sum;



    }

    public static void main(String[] args) {
        System.out.println(sumOdd());


    }
}
