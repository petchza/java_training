package code;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String quit = "";
		while (!quit.equalsIgnoreCase("y")) {
			try {
				List<String> action = new ArrayList<>();
				
				System.out.print("Enter number : ");
				int number = scanner.nextInt();
				
				if((number >=1) && (number <=6)) {
					action = getStringAction(scanner,number);
					if(validateInput(action,number)) {
//						diceAction();
						System.out.println("Work");
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

	private static void diceAction() {
		
		
	}
	
	private static boolean validateInput(List<String> action, int number) {
		String pattern = "BCDFLR";
		boolean ststus = true;
		for(int i = 0;i<number;i++) {
			if((action.get(i).length() < 1) && (action.get(i).length() > 1000)) {
				ststus = false;
				break;
			}else {
//				if(pattern.contains(action.get(i))){
//					ststus = false;
//					break;
//				}
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
