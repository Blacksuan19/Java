import java.util.*;
public class n3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double charge = 0;
        System.out.print("Enter amount of check: ");
        double check = input.nextInt();
        if (check  < 500)
        {
            charge = 5;
        }
        else if (check >= 500 && check  < 2500)
        {
            charge = (20 * check) / 100 ;
        }
        else if (check > 2500 && check  < 10000)
        {
            charge = (15 * check) / 100;
            charge += 15;
        }
        else if (check > 10000)
        {
            charge = (6 * check) / 100;
            charge += 60;
        }
        System.out.println("The charge for RM " + check + " is RM" + charge);
    }
}