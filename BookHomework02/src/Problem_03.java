public class Problem_03 {
	public static void main(String[] args) {
		// check if given number contains the number 7 as 3rd digit form right to left
		
		int num = 12345;
		
		if((num % 1000 - num % 100)/100 == 7)
		{
			System.out.println("The 3rd digit is 7");
		}
		else
		{
			System.out.println("The 3rd digit is " + (num % 1000 - num % 100)/100);
		}
	}
}
