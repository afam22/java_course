package chapter3;

import java.util.Scanner;

/*
* LOGICAL OPERATORS:
* To qualify for a loan, a person must make at least $30,000
* and have been working at their current job for at least 2 years.
*/
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("please enter numbers of year in service:");
        double years = scanner.nextInt();
        scanner.close();

        if(salary >= requiredSalary && years>=requiredYearsEmployed){
                System.out.println("Congrats!!! you are eligible for a loan!!");
        }
        else{
            System.out.println("sorry!!! you do not meet the requirement");
        }
    }
}
