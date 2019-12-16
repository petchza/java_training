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
		String q = "";
		while(!q.equalsIgnoreCase("y")) {
			//Step 1 get input value of type double
			System.out.print("Enter a : ");
			double a = scanner.nextDouble();

			System.out.print("Enter b : ");
			double b = scanner.nextDouble();
			//Step 2 pass value both to method calculate pythagoras
			double result = calculatePythagoras(a,b);
			//Step 3 set DecimalFormat for set 6 decimal points and show the result
			DecimalFormat decimalFormat = new DecimalFormat("#.000000");
			System.out.println(decimalFormat.format(result));

			System.out.println("Do you want to exit?");
			q = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}

	private static double calculatePythagoras(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
}
