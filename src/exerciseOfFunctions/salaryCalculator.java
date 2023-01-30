package exerciseOfFunctions;

import java.util.Scanner;

// input1:no  of hrs the employee works for a week
// input2:amount of money employee makes per hour
//output:employee gross yearly salary
public class salaryCalculator {
    public static double employeeSalary(double hoursPerWeek , double moneyPerHour){
        double weeklySalary = (hoursPerWeek*moneyPerHour);
        return weeklySalary*52;

    }
    public static void main(String[] args) {
        double salary = employeeSalary(40,15);
        System.out.println(salary);


    }
}
