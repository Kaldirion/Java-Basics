
public class Problem_10 {

	public static void main(String[] args) {
		// write program with input - 4 digit number (abcd)
		//  - find the sum of all digits
		//  - print dcba
		//	- print dabc
		//	- print acbd

		int num = 1234;
		
		int digit1 = (num - num%1000)/1000;
		int digit2 = (num%1000 - num%100)/100;
		int digit3 = (num%100 - num%10)/10;
		int digit4 = num%10;
		
		int sum = digit1 + digit2 + digit3 + digit4;
		System.out.println(sum);
		
		String str1 = String.valueOf(digit4)+String.valueOf(digit3)+String.valueOf(digit2)+String.valueOf(digit1);
		String str2 = String.valueOf(digit4) + String.valueOf(digit1) + String.valueOf(digit2) + String.valueOf(digit3);
		String str3 = String.valueOf(digit1) + String.valueOf(digit3) + String.valueOf(digit2) + String.valueOf(digit4);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
