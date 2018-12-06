import java.util.*;
public class n5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int score = 0;
        do
        {
            System.out.print("Enter your score: ");
            score = input.nextInt();
            if (score >= 60)
            {
                System.out.println("You pass the exam. ");
            }

            if (score < 60 && score != -1)
            {
                System.out.println("You didn't pass the exam. ");
            }
        }
        while(score != -1);
    }
}