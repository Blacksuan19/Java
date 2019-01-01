import java.util.*;

public class hi{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num = in.nextInt();
		if (num % 5 == 0) {
			System.out.println("HIFive");
		}
		else if (num % 2 == 0) {
			System.out.println("HIEven");
		}
		else {
			System.out.println("Not divisable by either 5 or 2");
		}
		in .close();
	}
}