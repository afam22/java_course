package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        //Creating a new object for rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);

        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of Room 1:" + areaOfRoom1);

        //Creating another object for rectangle 2
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of Room 2:" + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both Rooms are: " + totalArea);

    }


}
