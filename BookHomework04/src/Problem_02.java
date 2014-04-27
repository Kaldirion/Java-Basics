import java.util.Scanner;
public class Problem_02 {

	public static void main(String[] args) {
		// write program that show the sign of the difference of 2 integers , wothout 
		// calculating it
		
		Scanner Input = new Scanner(System.in);
		
		int num1 = Input.nextInt();
		int num2 = Input.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("+");
		}
		else
		{
			System.out.println("-");
		}
	}

}
