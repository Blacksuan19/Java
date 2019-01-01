import java.util.*;
class car
{
    String brand;
    String name;
    int speed;
    int year;
    int power;
    car()
    {
        brand = "\0";
        name = "\0";
        speed = 0;
        year = 0;
        power = 0;
    }
    car(String brand, String name, int speed, int year, int power)
    {
        this.brand = brand;
        this.name = name;
        this.speed = speed;
        this.year = year;
        this.power = power;
    }
    
}
public class object
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        car fav = new car();
        System.out.print("Enter car brand name: ");
        fav.brand = input.next();
        System.out.print("Enter car name: ");
        fav.name = input.next();
        System.out.print("Enter car speed: ");
        fav.speed = input.nextInt();
        System.out.print("Enter car manufacturing year: ");
        fav.year = input.nextInt();
        System.out.print("Enter car horse power: ");
        fav.power = input.nextInt();
        System.out.println(fav.brand + "\n" + fav.name + "\n" + fav.speed + "\n" + fav.year + "\n" + fav.power + "\n");
        input.close();
    }

}