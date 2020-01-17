package code;

import java.util.Random;
import java.util.Scanner;

public class Word_Chain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String q = "";
		while (!q.equalsIgnoreCase("y")) {
			try {

				System.out.print("Enter L : ");
				int l = scanner.nextInt();
	
				System.out.print("Enter N : ");
				int n = scanner.nextInt();
	
				if ((l >= 3) && (l <= 1000) && (n >= 1) && (n <= 30000)) {
					genString(l,n);
				} else {
					System.out.println("Error length of l or n");
				}
	
				System.out.print("Do you want to exit? (y/n) : ");
				q = scanner.next();
				
			}catch(NumberFormatException e) {
				System.out.println("Error type.");
			}
		}
		System.out.println("End");
		scanner.close();
	}
	
	private static void genString(int l, int n) {
		String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		String valueB = "";
		for(int i = 0;i<n;i++) {		
			char c;
			StringBuilder valueA = new StringBuilder();
			for(int j = 0;j<l;j++) {
				if(i == 0 || random.nextInt(pattern.length()) % 2 ==0) {
					c = pattern.charAt(random.nextInt(pattern.length()));
				}else {
					c = valueB.charAt(j);
				}
				valueA.append(c);
			}
			System.out.println(valueA.toString());
			String output = checkWordChain(valueA,valueB,l);
			if(output != "") {
				System.out.println(output);
				break;
			}
			valueB = valueA.toString();
		}			
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
