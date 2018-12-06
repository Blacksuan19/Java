import java.util.*;
public class compNum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[11];
        System.out.printf("Enter %d number: ", nums.length);
        for (int i = 0; i < nums.length ; i++ )
        {
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length ; i++ )
        {
            if (nums[i] > nums[10])
            {
                System.out.printf("number %d at index %d is bigger than %d \n", nums[i], i + 1, nums[10]);
            }
            else if (nums[i] < nums[10])
            {
                System.out.printf("number %d at index %d is smaller than %d \n", nums[i], i + 1, nums[10]);
            }
            else if (nums[i] == nums[10])
            {
                System.out.printf("number %d at index %d is equal to %d \n", nums[i], i + 1, nums[10]);
            }
        }
    }
}