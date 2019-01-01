import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class grades
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        int[] grades = new int[students];
        System.out.print("Enter " + grades.length + " grades: " );
        for (int i = 0; i < grades.length ; i++ )
        {
            grades[i] = input.nextInt();
        }
        for (int i = 0; i < grades.length ; i++ )
        {
            if (grades[i] >= 60 && grades[i] < 80)
            {
                System.out.printf("Student %d score is %d and the grade is A\n", i + 1, grades[i]);
            }
            else  if (grades[i] >= 50 && grades[i] < 60)
            {
                System.out.printf("Student %d score is %d and the grade is B\n", i + 1, grades[i]);
            }
            else if (grades[i] >= 40 && grades[i] < 50)
            {
                System.out.printf("Student %d score is %d and the grade is C\n", i + 1, grades[i]);
            }
            else if (grades[i] >= 30 && grades[i] < 40)
            {
                System.out.printf("Student %d score is %d and the grade is D\n", i + 1, grades[i]);
            }
            else if (grades[i] < 30)
            {
                System.out.printf("Student %d score is %d and the grade is F\n", i + 1, grades[i]);
            }
        
        input.close();
    }
    }
}
