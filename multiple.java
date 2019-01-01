import java.util.*;
public class multiple
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first  integer: ");
        int first = input.nextInt();
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();
        if(isMultiple(first, second))
        {
            System.out.println(second + " is a multiple of " + first);
        }
        else if(!isMultiple(first, second))
        {
            System.out.println(second + " is not a multiple of " + first);
        }
        input.close();
    }
    static boolean isMultiple(int a, int b)
    {
        boolean c = b % a == 0;
        return c;
    }
}