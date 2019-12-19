package code;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test_0007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.000000");
		double pi = 3.14159265358979323846;
		
		String q = "";
		while(!q.equalsIgnoreCase("y")) {
		
		System.out.print("Enter r : ");
		double r = scanner.nextDouble();
		
		System.out.println(decimalFormat.format(euclideanGeometry(pi,r)));
		System.out.println(decimalFormat.format(taxicabGeometry(r)));
		
		System.out.print("Do you want to exit? (y/n) : ");
		q = scanner.next();
	}
	System.out.println("End");
	scanner.close();
	}
	
	private static double euclideanGeometry(double pi, double r) {
		return (pi*Math.pow(r, 2));
	}
	
	private static double taxicabGeometry(double r) {
		return ((2*r)*(2*r)/2);
	}
	
	
}
