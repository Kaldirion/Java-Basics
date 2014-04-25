
public class Problem_05 {

	public static void main(String[] args) {
		// calculate the perimeter and area of triangle by given sides and height
		
		double a = 5;
		double b = 4;
		double c = 3;
		double h = 2;
		
		double P = a + b + c;
		System.out.println(P);
		double A = Math.sqrt(P*(P-a)*(P-b)*(P-b));
		System.out.println(A);

	}

}
