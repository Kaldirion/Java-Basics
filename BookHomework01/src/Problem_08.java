
public class Problem_08 {
	public static void main(String[] args) {
		// write program that prints heart with the symbol 'o'

		int n = 6;
		
		int height = n;
		int width = 2*n-1;
		
		char[][] matrix = new char[height][width];
		
		for (int i = 0;i<height;i++)
		{
			for (int j = 0;j<width;j++)
			{
				matrix[i][j] = '1';
			}
		}
		
		for (int row = 0;row<height;row++)
		{
			for (int column = 0;column<width;column++)
			{
				if(row == height-1 && column == width/2)
				{
					matrix[row][column] = 'o';
				}
				if(row > height-1 && row < height - 3 && column > 0 && column < width -1)
				{
					if(column == width/2 - 1)
					{
						matrix[row][column] = 'o';
					}
				}
			}
		}
		
		
		// Printing
		for (int i = 0;i<height;i++)
		{
			for (int j = 0;j<width;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
