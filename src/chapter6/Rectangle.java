package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        setWidth(width);
    }

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public void setLength(double l){
        this.length = l;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
}
