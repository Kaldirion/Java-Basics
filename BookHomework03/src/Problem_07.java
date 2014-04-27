import java.util.Scanner;
public class Problem_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		System.out.println(Integer.max(Integer.max(Integer.max(num1,num2),Integer.max(num3,num4)),num5));
	}

}
