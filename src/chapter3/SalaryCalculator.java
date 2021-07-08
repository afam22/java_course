package chapter3;

import java.util.Scanner;

/*
If statement.
All sales get a payment of $1,000 a week.
Sales people that exceed 10 sales get an additional $250 bonus.
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize known values
        double salary = 1000;
        double bonus = 250;
        int salesQuota = 10;

        // get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > salesQuota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
