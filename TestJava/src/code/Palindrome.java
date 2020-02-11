package code;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String quit = "";
		while (!quit.equalsIgnoreCase("y")) {
			
			System.out.print("Enter palindrome : ");
			String value = scanner.next();
			
			if((value.length() >=2) && (value.length() <=200)) {
				
				System.out.println(checkPalindrome(value));
				
			}else {
				System.out.println("Error input length.");
				System.out.println("");
			}
			
			System.out.print("Do you want to exit? (y/n) : ");
			quit = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}

	private static String checkPalindrome(String value) {
		String result = "";
		
		if(isPalindrome(value)) {
			result = checkTypePalindrome(value);
		}else {
			result = "No";
		}
		return result;
	}

	private static boolean isPalindrome(String value) {
		boolean statusPalindrome;
		StringBuilder tempValue = new StringBuilder(value);
		String reverseValue = tempValue.reverse().toString();
		
		if(value.equalsIgnoreCase(reverseValue)) {
			statusPalindrome = true;
		}else {
			statusPalindrome = false;
		}
		return statusPalindrome;
	}
	
	
	private static String checkTypePalindrome(String value) {

//		if() {
//			
//		}
		
		
		return "nextchektype";
	}
	
	
	private static boolean checkDoublePalindrome(String value) {
		
		return false;
	}
}
