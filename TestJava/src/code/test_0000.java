package code;

import java.util.Scanner;

public class test_0000 {

	public static void main(String[] args) {
		
		String a = "";
		String b = "";
		Scanner scanner =  null;
		do { 
			try {
				scanner = new Scanner(System.in);
				
				System.out.print("Enter a : ");
				a  = scanner.nextLine();
				
				if(a.equalsIgnoreCase("q")) {
					break;
				}
				
				System.out.print("Enter b : ");
				 b  = scanner.nextLine();
				
				 if(b.equalsIgnoreCase("q")) {
						break;
					}
				 
				if(Integer.valueOf(a) >= 0 && Integer.valueOf(a) <= Math.pow(10, 9) && Integer.valueOf(b) >= 0 && Integer.valueOf(b) <= Math.pow(10, 9)) {           
					System.out.println("a + b = "+ (Integer.valueOf(a)+Integer.valueOf(b))+"\n");
				}else {
					System.out.println("Error value.");
				}
			}catch(NumberFormatException e) {
				System.out.println("error type");
			}
		
		}while(!a.equalsIgnoreCase("q") || !b.equalsIgnoreCase("q")); 
			System.out.println("end");
			scanner.close();
		
	}
}
