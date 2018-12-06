public class TestRectangle {
    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle();
        one.width = 4;
        one.height = 40;
        two.width = 3.5;
        two.height = 35.9;
        System.out.println("Rectangle one: \nWidth: " + one.width + "\nHeight: " + one.height + "\nArea: " + one.getArea() + "\nPerimeter: " + one.getPerimeter() + "\n");
        System.out.println("Rectangle two: \nWidth: " + two.width + "\nHeight: " + two.height + "\nArea: " + two.getArea() + "\nPerimeter: " + two.getPerimeter());
    }
}