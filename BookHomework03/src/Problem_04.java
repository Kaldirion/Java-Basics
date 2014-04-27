import java.util.Scanner;

public class Problem_04 {
	public static void main(String[] args) {
		// Write a program , that reads from the console 2 integers, and 
		// prints out all number between them , that %5 == 0

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		
		for(int i = num1;i < num2;i++)
		{
			if(i%5 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
