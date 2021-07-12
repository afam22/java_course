package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo homeAreaCalculatorRedo = new HomeAreaCalculatorRedo();
        // create 2 instances of the rectangle
        Rectangle kitchen = homeAreaCalculatorRedo.getRoom();
        Rectangle bathroom = homeAreaCalculatorRedo.getRoom();

        double area = homeAreaCalculatorRedo.calculateTotalArea(kitchen,bathroom);

        System.out.println("Total Area = " + area);


        homeAreaCalculatorRedo.scanner.close();
    }

    public Rectangle getRoom(){


        System.out.println("Enter Length:");
        double length = scanner.nextDouble();

        System.out.println("Enter Width:");
        double width = scanner.nextDouble();


        return new Rectangle(length,width);

    }

    public double calculateTotalArea(Rectangle kitchen, Rectangle bathroom){

        return kitchen.calculateArea() + bathroom.calculateArea();
    }

}
