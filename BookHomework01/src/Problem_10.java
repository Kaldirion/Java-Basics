
public class Problem_10 {
	public static void main(String[] args) {
		// declare two variable of type int with values 5 and 10
		// switch there values and print the result
		
		int varOne = 5;
		int varTwo = 10;
		
		System.out.println("Initial values for first variable " + varOne + " and the second variabe " + varTwo);
		
		int varHelp = varOne; 
		varOne = varTwo;
		varTwo = varHelp;
		
		System.out.println("After swich values for first variable " + varOne + " and the second variabe " + varTwo);
	}
}
