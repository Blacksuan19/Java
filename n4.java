import java.util.*;
public class n4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter current day of the week: ");
        int current = input.nextInt();
        System.out.print("Enter number of days passed since today: ");
        int coming = input.nextInt();
        if (coming > days.length) {
        	coming = (int)coming % 7;
        }
        System.out.println("Today is " + days[current] + " and the future day is " + days[current + coming]);
        input.close();
    }

}