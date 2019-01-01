import java.util.*;
public class sort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] a = new double[3];
        System.out.print("Enter 3 integer numbers: ");
        for (int i = 0; i < a.length ; i++ )
        {
            a[i] = input.nextDouble();
        }
        displaySortedNumbers(a);
        input.close();
    }
    public static void displaySortedNumbers(double[] a)
    {
        double temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Entered numbers in decreasing order: ");
        for (int i = 0; i < a.length ; i++ )
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }
}