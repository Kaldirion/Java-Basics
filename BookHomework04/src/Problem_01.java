import java.util.Scanner;
public class Problem_01 {

	public static void main(String[] args) {
		// write program that swap values of 2 integers if the first > second
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int numHelp = 0;
		
		if(num1 > num2)
		{
			numHelp = num2;
			num2 = num1;
			num1 = numHelp;
		}
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
