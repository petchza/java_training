package code;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String quit = "";
		boolean statusStringAction;
		while (!quit.equalsIgnoreCase("y")) {
			try {
				List<String> action = new ArrayList<>();
				
				System.out.print("Enter number : ");
				int number = scanner.nextInt();
				
				if((number >=1) && (number <=6)) {
					action = getStringAction(scanner,number);
					statusStringAction = validateStringAction(action,number);
					if(statusStringAction) {
						diceAction(action,number);
					}else {
						System.out.println("Error string action not 1-1000 or value not match 'B,C,D,F,L,R'");
					}
				}else {
					System.out.println("Error length number. (1-6)");
					System.out.println("");
				}
			}catch(InputMismatchException e) {
				System.out.println("Error type number.");
			}
			System.out.println("Do you want to exit? (y/n) : ");
			quit = scanner.next();
		}
		System.out.println("End");
		scanner.close();
	}

	private static void diceAction(List<String> action, int number) {
		System.out.println("---------------------");
		int result = 0;
		for (int i = 0; i < number; i++) {
			String actionString = action.get(i);
			result = doAction(actionString);
			System.out.println(result);
		}
		System.out.println("END");
	}
	
	private static int doAction(String actionString) {
		int top = 1, font = 2, left = 3, back = 5, rigth = 4, bottom = 6;
		int diceTop = 0, diceFont = 0, diceLeft = 0, diceBack = 0, diceRigth = 0, diceBottom = 0;
		int tempTop = 0,tempFont = 0;
		for(int count=0;count<actionString.length();count++) {
			switch(actionString.charAt(count)) {
			case 'F': {
				if(count == 0) {
					diceTop = back;
					diceFont = top;
					diceLeft = left;
					diceBack = bottom;
					diceRigth = rigth;
					diceBottom = font;
				}else {
					tempTop = diceTop;
					diceTop = diceBack;
					diceBack = diceBottom;
					diceBottom = diceFont;
					diceFont = tempTop;
				}
				break;
			}  
			case 'B': {
				if(count == 0) {
					diceTop = font;    
					diceFont = bottom;
					diceLeft = left;
					diceBack = top;
					diceRigth = rigth;
					diceBottom = back;
				}else {
					tempTop = diceTop;
					diceTop = diceFont;
					diceFont = diceBottom;
					diceBottom = diceBack;
					diceBack = tempTop;
				} 
				break;
			}
			case 'L':  {
				if(count == 0) {
					diceTop = rigth;    
					diceFont = font;
					diceLeft = top;
					diceBack = back;
					diceRigth = bottom;
					diceBottom = left;
				}else {
					tempTop = diceTop;
					diceTop = diceRigth;
					diceRigth = diceBottom;
					diceBottom = diceLeft;
					diceLeft = diceTop;
				} 
				break;
			}
			case 'R':  {
				if(count == 0) {
					diceTop = left;    
					diceFont = font;
					diceLeft = bottom;
					diceBack = back;
					diceRigth = top;
					diceBottom = rigth;
				}else {
					tempTop = diceTop;
					diceTop = diceLeft;
					diceLeft = diceBottom;
					diceBottom = diceRigth;
					diceRigth = tempTop;
				} 
				break;
			}
			
			case 'C': {
				if(count == 0) {
					diceTop = top;    
					diceFont = rigth;
					diceLeft = font;
					diceBack = left;
					diceRigth = back;
					diceBottom = bottom;
				}else {
					tempFont = diceFont;
					diceFont = diceRigth;
					diceRigth = diceBack;
					diceBack = diceLeft;
					diceLeft = tempFont;
				} 
				break;
			}  
			
			case 'D': {
				if(count == 0) {
					diceTop = top;    
					diceFont = left;
					diceLeft = back;
					diceBack = rigth;
					diceRigth = font;
					diceBottom = bottom;
				}else {
					tempFont = diceFont;
					diceFont = diceLeft;
					diceLeft = diceBack;
					diceBack = diceRigth;
					diceRigth = tempFont;
				} 
				break;
			   } 
			}
		}
		
		return diceFont;
	}

	private static boolean validateStringAction(List<String> action, int number) {
		String pattern = "BCDFLR";
		boolean ststus = true;
		for(int i = 0;i<number;i++) {
			if((action.get(i).length() < 1) && (action.get(i).length() > 1000)) {
				ststus = false;
				break;
			}else {
				ststus = checkPattern(action,i,pattern,ststus);
			}
		}
		return ststus;
	}

	private static boolean checkPattern(List<String> action, int i, String pattern, boolean ststus) {
		String singleWord = action.get(i);
		for(int count=0;count<singleWord.length();count++) {
			int find = pattern.indexOf(singleWord.charAt(count));
			if(find == -1) {
				ststus = false;
				break;
			}
		}
		return ststus;
	}

	private static List<String> getStringAction(Scanner scanner, int number) {
		List<String> action = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			action.add(scanner.next());
		}
		return action;
	}
}
