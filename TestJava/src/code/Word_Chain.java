package code;

import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.StringComparable;

public class Word_Chain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String quit = "";
		while (!quit.equalsIgnoreCase("y")) {
			try {

				System.out.print("Enter length : ");
				int lengthOfString = scanner.nextInt();
	
				System.out.print("Enter number : ");
				int numberOfString = scanner.nextInt();
				
				if(validateInput(lengthOfString,numberOfString)) {
					genString(lengthOfString,numberOfString);
				}else {
					System.out.println("Error length 3-1000 or number 1-3000");
				}
				System.out.print("Do you want to exit? (y/n) : ");
				quit = scanner.next();
				
			}catch(NumberFormatException e) {
				System.out.println("Error type.");
			}
		}
		System.out.println("End");
		scanner.close();
	}
	
	private static boolean validateInput(int lengthOfString, int numberOfString) {
		boolean status = false;
		if ((lengthOfString >= 3) && (lengthOfString <= 1000)) {
			if((numberOfString >= 1) && (numberOfString <= 30000)) {
				status =  true;
			}
		} 
		return status;
	}
	
	private static String genString(int length, int number) {
		String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		String valueB = "";
		for(int i = 0;i<number;i++) {		
			char c;
			StringBuilder valueA = new StringBuilder();
			for(int j = 0;j<length;j++) {
				if(i == 0 || random.nextInt(pattern.length()) % 2 ==0) {
					c = pattern.charAt(random.nextInt(pattern.length()));
				}else {
					c = valueB.charAt(j);
				}
				valueA.append(c);
			}
			System.out.println(valueA.toString());
			String output = checkWordChain(valueA,valueB,length);
			if(output != "") {
				System.out.println(output);
				break;
			}
			valueB = valueA.toString();
		}
		return valueB;			
	}

	private static String checkWordChain(StringBuilder valueA, String valueB,int l) {
		String output = "";
		int count = 0;
		if(valueB != "") {	
			for(int i=0;i<l;i++) {
				if(valueA.charAt(i) != valueB.charAt(i)) {
					count++;
				}
			}
			if(count > 2) {
				output = "word chain : "+valueB;
			}
		}
		return output;
	}
	
}
