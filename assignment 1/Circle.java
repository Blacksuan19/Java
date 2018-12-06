public class Circle {
    double radius;
    public Circle () {
    }
    public Circle(double newRadius) {
        radius = newRadius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
