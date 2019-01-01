import java.util.*;
public class add{
	public static void main(String[] args)
	{
		int n1 = (int)(System.currentTimeMillis() % 10);
		int n2 = (int)(System.currentTimeMillis() / 10 % 10);
		int answer = operation(n1, n2);
		while(answer == n1 + n2) {
			System.out.println( n1 + " + " + n2 + " = " + answer + " is " + (n1 + n2 == answer));
			System.out.print("Do you want to try again? ");
			int yus = in.nextInt();
			if(yus == 1){
				n1 = (int)(System.currentTimeMillis() % 10);
				n2 = (int)(System.currentTimeMillis() / 10 % 10);
				answer = operation(n1, n2);
			} else break;
		}
		System.out.println("this is from atom");
		in.close();
	}
	
	static int operation(int a, int b){
		Scanner in = new  Scanner(System.in);
		System.out.print("What is " + a + " + " + b + " ? ");
		int answer = in.nextInt();
		while (a + b != answer) {
			System.out.print("wrong answer. try again, What is " + a + " + " + b + " ? ");
			answer = in.nextInt();
		}
		in.close();
		return answer;
	}
}
