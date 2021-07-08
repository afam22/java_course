package chapter2;

import java.util.Scanner;

public class CalculateGrossPay {
    public static void main(String[] args) {
//        1. get hour worked
        System.out.println("Please enter hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

//        2. get hourly rate
        System.out.println("Please enter hourly rate: ");
        double rate = scanner.nextDouble();
        scanner.close();

//        3. multiply hour and rate
        double grossPay = hour * rate;

//        4. display gross pay
        System.out.println("Gross pay calculated is = $" + grossPay);
    }
}
