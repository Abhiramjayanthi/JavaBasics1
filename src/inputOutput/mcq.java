package inputOutput;

import java.util.Scanner;

public class mcq {
    public static void main(String[] args) {
        String question = "what is the largest planet in out solar system";
        String option1 = "Earth";
        String option2 = "Saturn";
        String option3 = "jupiter";

        String correctAns = option3;

        System.out.println(question);

        System.out.println("Choose the one of the following"+"=");
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(correctAns.equals(input))
        {
            System.out.println("Congratulations , Correct answer");
        }
        else
        {
            System.out.println("Wrong Answer");
        }





    }
}
