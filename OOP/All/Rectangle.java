package All;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        } else {
            System.out.println("[ERROR] The width must be positive!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0){
            this.height = height;
        } else {
            System.out.println("[ERROR] The height must be positive!");
        }
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return width * 2 + height * 2;
    }

    public boolean isSquare(){
        return width == height;
    }

    @Override
    public String toString(){
        return "Width: " + getWidth() + ", Height: " + getHeight() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Is square? : " + isSquare();
    }
}
