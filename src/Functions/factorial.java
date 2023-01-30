package Functions;
import java.util.Scanner;
//n!=n*(n-1)*(n-2).....
//5!=5*4*3*2*1
public class factorial {
    public static void fact(int n){
        int f=1;
        for(int i=n ;i>=1;i-- ){
            f = f*i;
            System.out.println(f);
            return ;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
