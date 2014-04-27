import java.util.Scanner;
public class Problem_06 {

	public static void main(String[] args) {
		// write program that reads 5 integers and prints out there sum
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.println(sum);
	}

}
