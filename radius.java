import java.util.*;
class Rectangle
{
    Double width;
    Double height;
    Rectangle()
    {
        width = 0.0;
        height = 0.0;
    }
    Rectangle(Double width, Double height)
    {
        this.width = width;
        this.height = height;
    }
}
public class radius
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();
        System.out.print("");
        rec.width = getArea(rec.width);
    }
    public static Double getArea(Double a)
    {
    	Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        return a;
    }
        public static Double getRadius(Double a)
    {
    	Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        return a;
    }
}