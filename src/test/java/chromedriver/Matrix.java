package chromedriver;

public class Matrix {
	public static void main(String[] args) {
		
		int[][] a = {{3, 4}, {6, 7}};
		int[][] b = {{2, 6}, {4, 5}};
		
		int c[][] = new int [2][2];
		
		for (int i=0; i<2; i++) 
		{
			for (int j=0; j<2; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println("Addition of 2 maxtrix :" +c[i][j]);
			}
		}
	}

}
