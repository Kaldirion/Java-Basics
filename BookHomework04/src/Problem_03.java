import java.util.Scanner;
public class Problem_03 {

	public static void main(String[] args) {
		// write program, that finds the biggest number between 3 integers
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println(Integer.max(Integer.max(num1,num2),num3));
	}

}
