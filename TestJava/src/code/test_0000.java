package code;

import java.util.Scanner;

public class test_0000 {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);;
		String q = "";
		while(!q.equalsIgnoreCase("y")) {
			try {

				System.out.print("Enter a : ");
				int a  = scanner.nextInt();

				System.out.print("Enter b : ");
				int b  = scanner.nextInt();

				if((a >= 0 && a <= Math.pow(10, 9)) && (b >= 0 && b <= Math.pow(10, 9))) {
					System.out.println(a+" + "+b+" = "+ plusNumber(a,b)+"\n");
				}else {
					System.out.println("Error value.");
				}
				
			}catch(NumberFormatException e) {
				System.out.println("error type");
			}
			System.out.println("Do you want to exit?");
			q = scanner.next();
		}
			System.out.println("End");
			scanner.close();

	}
	
	public static int plusNumber(int a, int b) {
		return a+b;
	}
	
}
