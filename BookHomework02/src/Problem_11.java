import java.util.Scanner;

public class Problem_11 {

	public static void main(String[] args) {
		// input is number n and position p
		// find what is the value of the bit in position p of number n
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number \"n\"");
		int num = input.nextInt();
		
		System.out.println("Please enter position \"p\"");
		int position = input.nextInt();
		
	    String binaryString = Integer.toString(num, 2);
		
	    System.out.println(binaryString);
	    
	    while (binaryString.length() < 32)
	    {
	    	binaryString = "0" + binaryString;
	    }
	    
	   if(binaryString.charAt(binaryString.length() - position) == '1')
	   {
		   System.out.println("The bit is 1");
	   }
	   else
	   {
		   System.out.println("The bit is 0");
	   }
	   
	}

}
