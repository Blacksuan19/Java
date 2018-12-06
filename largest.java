import java.util.*;
public class largest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.printf("Enter %d number: ", nums.length);
        for (int i = 0; i < nums.length ; i++ )
        {
            nums[i] = input.nextDouble();
        }
        System.out.println("The maximum number is: " + max(nums));
    }
    public static double max(double[] array)
    {
        double largest = array[0];
        for (int i = 0; i < array.length ; i++ )
        {
            if (largest < array[i])
            {
                largest = array[i];
            }
        }

        return largest;
    }
}