package code;

import java.util.Scanner;

public class test_0000 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			System.out.print("Enter a : ");
			int a  = scanner.nextInt();
			
			System.out.print("Enter b : ");
			int b  = scanner.nextInt();
			
			if(a >= 0 && a <= Math.pow(10, 9) && b >= 0 && b <= Math.pow(10, 9)) {           
				System.out.println("a + b = "+ (a+b));
			}else {
				System.out.println("Error value.");
			}
			scanner.close();
		
		}catch(Exception e) {
			System.out.println("Error type a or b");
			scanner.close();
		}
		
	}
}
