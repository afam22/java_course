package chapter5;

import java.util.Scanner;

/*
* VARIABLE SCOPE
* Write an instant credit check program that approves
* any one who makes more than $25,000 and has a credit score
* of 700 or better. Reject all others.
*/
public class InstantCreditCheck {

    //Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Get what we dont know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if the user is qualified
        boolean qualified = isUserQualified(creditScore,salary);        //passing arguments

        //notify user
        notifyUser(qualified);

    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    /*
    Note below:
    creditScorep arguments above will store its value
    in credit score parameters below as well as
    salaryp above to salary params below
    */

    public static boolean isUserQualified(int creditScore, double salary ){     //passing parameters
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
        return true;
        }else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! you have been approved");
        }
        else {
            System.out.println("Sorry, you have been declined");
        }
    }

}
