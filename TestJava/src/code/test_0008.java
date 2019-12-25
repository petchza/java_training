package code;

import java.util.Scanner;

public class test_0008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String q = "";
		while (!q.equalsIgnoreCase("y")) {

			System.out.print("Enter x1 : ");
			int x1 = scanner.nextInt();
			
			System.out.print("Enter s : ");
			int s = scanner.nextInt();

			if ((s >= -1000) && (s <= 1000)) {
				System.out.println("X2 = "+calculateX2(s,x1));
			} else {
				System.out.println("Error length s");
				System.out.println("--------------------");
			}

			System.out.print("Do you want to exit? (y/n) : ");
			q = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}
	
	private static int calculateX2(int s ,int x1){
		return ((2*s)-x1);
	}
	
}
