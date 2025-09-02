package Moderate;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        } else {
            System.out.println("[ERROR] The radius must be positive!");
        }
    }

    @Override
    double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Radius: " + getRadius() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
