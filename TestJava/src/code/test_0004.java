package code;

import java.util.Scanner;


public class test_0004 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String q = "";
		while(!q.equalsIgnoreCase("y")) {
			try {
			//Step1 get input String
			System.out.print("Enter string : ");
			String input = scanner.next();
			//Step2 check condition and pass string to method
			if(input.length() <= 10000) {
				System.out.println(checkCharacterUpperLowerAndMix(input));
				System.out.println("----------------------");
			}
			System.out.println("Do you want to exit?");
			q = scanner.next();
		}catch(Exception e) {
			System.out.println("Error type input!");
			System.out.println("----------------------");
			System.out.println();
		}
		}
		System.out.println("End");
		scanner.close();
		
	}
	
	private static String checkCharacterUpperLowerAndMix(String value) {
		
		//Step 3 convert string to array char for check Uppercase Lowercase and Mix one by one
		char[] inputChar = value.toCharArray();
		boolean statusUpper = false;
		boolean statusLower = false;
		String result = "";
		//Step 4 check Uppercase Lowercase and Mix in array char
		for(int i = 0 ;i<value.length(); i++) {
			if(Character.isUpperCase(inputChar[i])) {
				statusUpper = true;
			}else{
				statusLower = true;
			}
		}
		
		//Step 5 check status Uppercase Lowercase and Mix for set string and return 
		if(statusUpper == true && statusLower == true) {
			result = "Mix";
		}else if(statusUpper == true && statusLower == false) {
			result = "All Capital Letter";
		}else {
			result = "All Small Letter";
		}
		return result;
	}	
}
