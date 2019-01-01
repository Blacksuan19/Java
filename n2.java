import java.util.*;
public class n2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last 4 digits of your identity card: ");
        int digi = input.nextInt();
        int length = (int)(Math.log10(digi) + 1); // check if the entered number has less or more than 4 digits
        while (length != 4)
        {
            System.out.print("wrong entry!, please enter last 4 digits: ");
            digi = input.nextInt();
            length = (int)(Math.log10(digi) + 1);
        }
        if (digi % 2 == 0)
        {
            System.out.println("Female");
        }
        else
        {
            System.out.println("Male");
        }
        input.close();
    }
}