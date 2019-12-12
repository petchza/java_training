package code;

import java.util.Scanner;

public class test_0003 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String q = "";
		while(!q.equalsIgnoreCase("y")) {
		System.out.print("Enter matrix m : ");
		int m = scanner.nextInt();

		System.out.print("Enter matrix n : ");
		int n = scanner.nextInt();
		System.out.println();

		//MAX: USING PARENTHESIS FOR MULTIPLE IF CONDITION
		//if( (m <= 100 && m >= 1) && (n <= 100 && n >= 1))
		//check condition m and n is 1-100
		if((m <= 100 && m >= 1) && (n <= 100 && n >= 1)) {
	
			int[][] tempA = getMatrixA(m,n,scanner);
			
			int[][] tempB = getMatrixB(m,n,scanner);
			
			int[][] result = getMatrixAddition(m,n,tempA,tempB);

			printMatrix(m, n, result);
			
			System.out.println("Do you want to exit?");
			q = scanner.next();
		}else {
			System.out.println("Error length m or n");
			System.out.println("--------------------------");
			System.out.println();
		}
		}
		scanner.close();
		System.out.println("End");
	}

	
	private static int[][] getMatrixA(int m,int n,Scanner scanner) {
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("--------------------------");
		return a;
	}
	
	private static int[][] getMatrixB(int m,int n,Scanner scanner) {
		int[][] b = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		return b;
	}
	
	
	private static int[][] getMatrixAddition(int m, int n, int[][] a, int[][] b) {
		int[][] c= new int[m][n];
		for (int k = 0; k < m; k++) {
			for (int l = 0; l < n; l++) {
				c[k][l] = a[k][l]+b[k][l];
			}
		}
		return c;
	}
	
	private static void printMatrix(int m, int n,int[][] result) {
		System.out.println("--------------------------");
		for (int k = 0; k < m; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print(result[k][l]+" ");
			}
			System.out.println();
		}
	}
}
