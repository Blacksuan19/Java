public class Rectangle {
    double width = 1, height = 1;
    public Rectangle() {
    }
    public Rectangle(double newWidth, double newHeight) {
        newWidth = width;
        newHeight = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
}