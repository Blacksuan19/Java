import java.util.*;
public class add{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n1 = (int)(System.currentTimeMillis() % 10);
		int n2 = (int)(System.currentTimeMillis() / 10 % 10);
		System.out.print("What is " + n1 + " + " + n2 + " ? ");
		int answer = in.nextInt();
		while (n1 + n2 != answer) {
			System.out.println("wrong answer. try again, What is " + n1 + " + " + n2 + " ? ");
			answer = in.nextInt();
		}
		if (answer == n1 + n2) {
			System.out.println( n1 + " + " + n2 + " = " + answer + " is " + (n1 + n2 == answer));
		}
		System.out.println("this is from atom");
	}
}
