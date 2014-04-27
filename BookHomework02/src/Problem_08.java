
public class Problem_08 {

	public static void main(String[] args) {
		// check if given point is in the circle K [(0,0),5]
		
		double PointX = 0.3d;
		double PointY = 1.5d;
		
		double Kx = 0;
		double Ky = 0;
		double R = 5;
		
		if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) < Math.pow(R, 2))
		{
			System.out.println("The point is in the circle");
		}
		else if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) == Math.pow(R, 2))
		{
			System.out.println("The point is on the circle");
		}
		else if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) > Math.pow(R, 2))
		{
			System.out.println("The point is out of the circle");
		}
		
	}

}
