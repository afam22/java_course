package chapter3;

import java.util.Scanner;

/*
* NESTED IFS:
* To qualify for a loan, a person must make at least $30,000
* and have been working at their current job for at least 2 years.
*/
public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("please enter numbers of year in service:");
        double years = scanner.nextInt();
        scanner.close();

        if(salary >= requiredSalary){
            if(years>=requiredYearsEmployed){
                System.out.println("Congrats!!! you are eligible for a loan!!");
            }
            else {
                System.out.println("Sorry, you are not up to " + requiredYearsEmployed + " years employed");
            }
        }
        else{
            System.out.println("sorry!!! you must earn at least $" + requiredSalary);
        }
    }
}
