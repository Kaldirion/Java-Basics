
public class Problem_09 {

	public static void main(String[] args) {
		// check if point O(x,y) is in circle K((0,0),5)
		//and outside rectangle [(-1,1),(5,5)]
		
		double PointX = 0.3d;
		double PointY = 1.5d;
		
		double Kx = 0;
		double Ky = 0;
		double R = 5;
		
		double Rec1x = -1;
		double Rec1y = 1;
		double Rec2x = -1;
		double Rec2y = 5;
		double Rec3x = 5;
		double Rec3y = 5;
		double Rec4x = 5;
		double Rec4y = 1;
		
		if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) < Math.pow(R, 2))
		{
			if (PointX > Rec1x & PointY < Rec2y)
			{
				System.out.println("The point is in the circle and in the rectangle");
			}
			else if (PointX < Rec1x & PointY > Rec2y)
			{
				System.out.println("The point is in the circle and out of the rectangle");
			}
		}
		else if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) == Math.pow(R, 2))
		{
			if(PointX <= Rec3x & PointY <= Rec3y)
			{
				System.out.println("The point is on the circle and inside the rectangle");
			}
			else
			{
				System.out.println("The point is on the circle and outside the rectangle");
			}
		}
		else if(Math.pow(PointX-Kx, 2) + Math.pow(PointY-Ky, 2) > Math.pow(R, 2))
		{
			System.out.println("The point is out of the circle");
		}

	}

}
