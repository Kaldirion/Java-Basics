import java.util.Scanner;

public class Problem_13 {
	public static void main(String[] args) {
		// check if given number (n<100) is prime number
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
				if(num % i == 0)
				{
					count++;
				}
		}
		if(count == 2)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}
