public class Problem_07 {

	public static void main(String[] args) {
		//create program, that prints in the console triangle with equal sides.
		// each side is composed of '*'
		
		//set the lengt:
		
		int n = 6;
		
		int row = n;
		int column = 2*n - 1;
		
		char[][] matrix = new char[row][column];
		
		
		
		for (int i = 0;i<row;i++)
		{
			for (int j = 0;j<column;j++)
			{
				matrix[i][j] = '.';
			}
		}
		
		for (int i = 0;i<row;i++)
		{
			for (int j = 0;j<column;j++)
			{
				if(i == 0 && j == (column/2) )
				{
					matrix[i][j] = '*';
				}
				else if(i > 0 && i < row - 1)
				{
					if(j == (column/2) - i)
					{
						matrix[i][j] = '*';
					}
					else if(j == (column/2) + i)
					{
						matrix[i][j] = '*';
					}
				}
				else if(i == row-1)
				{
					matrix[i][j] = '*';
				}
			}
		}
		
		
		// print the matrix
		for (int i = 0;i<row;i++)
		{
			for (int j = 0;j<column;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
