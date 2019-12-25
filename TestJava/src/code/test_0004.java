package code;

import java.util.Scanner;


public class test_0004 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String q = "";
		while(!q.equalsIgnoreCase("y")) {
			try {
			System.out.print("Enter string : ");
			String input = scanner.next();

			if(input.length() <= 10000) {
				System.out.println(checkCharacterUpperLowerAndMix(input));
				System.out.println("----------------------");
			}else {
				System.out.println("Error length String!");
				System.out.println("----------------------");
				System.out.println();
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
		
		String result = "";
	
		if (value.toUpperCase().equals(value)) { 
			result = "All Capital Letter";
		}else if(value.toLowerCase().equals(value)){
			result = "All Small Letter";
		}else {
			result = "Mix";
		}

		return result;
	}	
	

}
