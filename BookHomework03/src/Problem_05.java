import java.util.Scanner;
public class Problem_05 {

	public static void main(String[] args) {
		// write program, that reads 2 integers and print the biggest (don't use if)
		
		Scanner Input = new Scanner(System.in);
		
		int num1 = Input.nextInt();
		int num2 = Input.nextInt();
		
		int num3 = Integer.max(num1, num2);
		
		System.out.println(num3);
	}

}
