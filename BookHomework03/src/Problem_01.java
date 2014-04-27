import java.util.Scanner;

public class Problem_01 {

	public static void main(String[] args) {
		// write program , that reads 3 integers from the console
		// print out the sum of the numbers;
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println(sum);

	}

}
