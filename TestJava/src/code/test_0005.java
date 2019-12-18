package code;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test_0005 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.000000");
		String q = "";
		while(!q.equalsIgnoreCase("y")) {

			System.out.print("Enter a, b or c : ");
			String value = scanner.next();
			
			switch(value) {
			case "a" : { 
							System.out.print("Enter b : ");
							double b = scanner.nextDouble();
							
							System.out.print("Enter c : ");
							double c = scanner.nextDouble();
							
							double a = calculatePythagorasA(b,c);
							System.out.println(decimalFormat.format(a));
							break;
					   }
						
			case "b" :	{
							System.out.print("Enter a : ");
				
							double a = scanner.nextDouble();
							
							System.out.print("Enter c : ");
							double c = scanner.nextDouble();
							
							double b = calculatePythagorasB(a,c);
							System.out.println(decimalFormat.format(b));
							break;
						}
			
			case "c" :	{
							System.out.print("Enter a : ");
							double a = scanner.nextDouble();
			
							System.out.print("Enter b : ");
							double b = scanner.nextDouble();
							
							double c = calculatePythagorasC(a,b);
							System.out.println(decimalFormat.format(c));
							break;
						}
			
			default : System.out.println("Input value not match!");
			
			}
			
			System.out.println("Do you want to exit?");
			q = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}

	private static double calculatePythagorasC(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	private static double calculatePythagorasA(double b, double c) {
		return Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
	}
	
	private static double calculatePythagorasB(double a, double c) {
		return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
	}
}
