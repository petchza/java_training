package code;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test_0005 {
	public static void main(String[] args) {

		//Interfere Mission
		//Add more input for specific which side that want to find (a ,b or c)
		//Example
		//Enter triangle side : (value a, b or c)
		//calculate to find other side
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

							System.out.println(decimalFormat.format(calculatePythagorasAOrB(b,c)));
							break;
					   }
						
			case "b" :	{
							System.out.print("Enter a : ");
				
							double a = scanner.nextDouble();
							
							System.out.print("Enter c : ");
							double c = scanner.nextDouble();
							
							System.out.println(decimalFormat.format(calculatePythagorasAOrB(a,c)));
							break;
						}
			
			case "c" :	{
							System.out.print("Enter a : ");
							double a = scanner.nextDouble();
			
							System.out.print("Enter b : ");
							double b = scanner.nextDouble();
							
							System.out.println(decimalFormat.format(calculatePythagorasC(a,b)));
							break;
						}
			
			default : System.out.println("Input value not match!");
			}
			System.out.print("Do you want to exit? (y/n) : ");
			q = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}

	private static double calculatePythagorasC(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	private static double calculatePythagorasAOrB(double valueAOrB, double c) {
		return Math.sqrt(Math.pow(c, 2) - Math.pow(valueAOrB, 2));
	}
	
}
