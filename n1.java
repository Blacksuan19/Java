import java.util.*;
public class n1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int time = input.nextInt();
        System.out.print(time + " Seconds is equal to ");
        time = time % (24 * 3600);
        int hour = time / 3600;

        time %= 3600;
        int minutes = time / 60 ;

        time %= 60;
        int seconds = time;
        System.out.print(hour + " hours and " + minutes + " minutes and " + seconds + " seconds\n");
        input.close();
    }
}