import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows and columsn for first matrix");
		int rowSize1 = sc.nextInt();
		int columnSize1 = sc.nextInt();

		int[][] matrixOne = new int[rowSize1][columnSize1];

		System.out.println("Enter the elements for first matrix");
		for (int i = 0; i <= rowSize1 - 1; i++) {
			for (int j = 0; j <= columnSize1 - 1; j++) {
				matrixOne[i][j] = sc.nextInt();
			}
		}
		System.out.println("Please enter number of rows and columns for second matrix");
		int rowSize2 = sc.nextInt();
		int columnSize2 = sc.nextInt();

		int[][] matrixTwo = new int[rowSize2][columnSize2];

		System.out.println("Enter the elements for first matrix");
		for (int i = 0; i <= rowSize2 - 1; i++) {
			for (int j = 0; j <= columnSize2 - 1; j++) {
				matrixTwo[i][j] = sc.nextInt();
			}
		}

		if (columnSize1 != rowSize2) {
			throw new IllegalArgumentException("Columns and row size does not match");
		}
		
		int[][] finalMatrix = new int[rowSize1][columnSize2];
		
		for(int i=0; i<=rowSize1-1; i++) {
			for(int j=0; j<=columnSize2-1; j++) {
				for(int k=0; k<=columnSize1-1; k++) {
					finalMatrix[i][j] = finalMatrix[i][j] + matrixOne[i][k] * matrixTwo[k][j];
				}
			}
		}
		
		for(int i=0; i<finalMatrix.length;i++) {
			System.out.println("");
			for(int j=0; j<finalMatrix[0].length; j++) {
				System.out.print(finalMatrix[i][j] + " ");
			}
		}
			

	}

}
