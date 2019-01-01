import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        Reverse(num);
        input.close();
    }
    public static void Reverse(int num)
    {
        int reversed = 0;
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The number reversed is " + reversed);

    }
}