package code;

import java.util.Scanner;

public class test_0003 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter matrix m : ");
		int m = scanner.nextInt();

		System.out.print("Enter matrix n : ");
		int n = scanner.nextInt();
		System.out.println();
		if (m <= 100 && m >= 1 || n <= 100 && n >= 1) {
			int a[][] = new int[m][n];
			int b[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("Enter martrix a : ");
					a[i][j] = scanner.nextInt();
				}
	
			}
			System.out.println("--------------------------");
			for (int g = 0; g < m; g++) {
				for (int h = 0; h < n; h++) {
					System.out.print("Enter martrix b : ");
					b[g][h] = scanner.nextInt();
				}
			}
			
			int c[][]=new int[m][n];
			System.out.println("--------------------------");
			for (int k = 0; k < m; k++) {
				for (int l = 0; l < n; l++) {
					c[k][l] = a[k][l]+b[k][l];
					System.out.print(c[k][l]+" ");
				}
				System.out.println();
			}
		}
		scanner.close();
		System.out.println("End");
	}
}
