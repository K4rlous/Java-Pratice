package Moderate;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base > 0){
            this.base = base;
        } else {
            System.out.println("[ERROR] The base must be greater than zero!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0){
            this.height = height;
        } else {
            System.out.println("[ERROR] The height must be greater than zero!");
        }
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimeter() {
        return base + height * 2;
    }

    @Override
    public String toString(){
        return "Base: " + getBase() + ", Height: " + getHeight() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

}
