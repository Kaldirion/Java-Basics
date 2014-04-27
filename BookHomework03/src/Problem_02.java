import java.util.Scanner;


public class Problem_02 {

	public static void main(String[] args) {
		// write program , that read from the console the radius of circle
		// and prints out the Area and Perimeter of the circle
		
		Scanner input = new Scanner(System.in);
		
		float R = input.nextFloat();
		
		double Perimeter = 2*Math.PI*R;
		
		double Area = Math.PI*Math.pow(R, 2);
		
		System.out.println(Perimeter);
		System.out.println(Area);
	}

}
