package exerciseOfFunctions;

public class fun {

    public static int voteOrNot(){
        int age=19;
        if(age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible for voting");
        }
        return age;
    }
    public static void main(String[] args) {
        System.out.println(voteOrNot());

    }
}
