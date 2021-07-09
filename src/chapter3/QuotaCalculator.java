package chapter3;

import java.util.Scanner;

/*
* IF ELSE
* All sales people are expected to make at least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who don't, they are informed of how many sales they were short.
*/
public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int salesNo = scanner.nextInt();
        scanner.close();

        if(salesNo >= quota){
            System.out.println("Congratulations!!! you have met your sales target.");
        }else {
            int salesShort = quota - salesNo;
            System.out.println("You are yet to reach your sales target, you are short of " + salesShort + " sales. You can do better!!!");
        }
    }
}
