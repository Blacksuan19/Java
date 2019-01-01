import java.util.*;
class Employee
{
    String name;
    int age;
    int salary;
    int incre;
    Employee(String name, int age, int salary, int incre)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.incre = incre;
    }
}
public class em
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Employee Second = new Employee("\0", 0, 0, 0);
        Employee Third = new Employee("\0", 0, 0, 0);
        System.out.print("Enter name  for second employee: ");
        Second.name = input.next();
        System.out.print("Enter age  for second employee: ");
        Second.age = input.nextInt();
        System.out.print("Enter name for third employee: ");
        Third.name = input.next();
        System.out.print("Enter salary for third employee: ");
        Third.salary = input.nextInt();
        System.out.print("Enter annual increment for third employee: ");
        Third.incre = input.nextInt();
        printFirst();
        printSec(Second.name, Second.age);
        System.out.println("\nTotal salary for " + "third employee (" +  Third.name + ") is: " + calcSalary(Third.salary, Third.incre));
        input.close();
    }
    static void printFirst()
    {
        Employee Andy = new Employee("Andy", 22, 2000, 200);
        System.out.println("\nEmployee One\n" + "Name: " + Andy.name + "\nAge: " + Andy.age + "\nSalary: " + Andy.salary + "\nAnnual Incerment: " + Andy.incre);
    }
    static void printSec(String a, int b)
    {
        System.out.println("\nEmployee Two\n" + "Name: " + a + "\nAge: " + b);
    }
    static int calcSalary(int a, int b)
    {
        int c = a + b;
        return c;
    }
}