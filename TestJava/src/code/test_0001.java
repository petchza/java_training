package code;

import java.util.Scanner;

public class test_0001 {
	public static void main(String[] args) {

		String a="",b="",c="";
		Scanner scanner = new Scanner(System.in);
		//1st : change do-while to while, update condition
		do {
		try {

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

			System.out.print("Enter c : ");
			c  = scanner.nextLine();

			if(c.equalsIgnoreCase("q")) {
				break;
			}

			int sum = Integer.valueOf(a)+Integer.valueOf(b)+Integer.valueOf(c);

			if(sum >=0 && sum <=100) {
				System.out.println("-------------------------");
				System.out.println("a = "+ a +"\n"+
								   "b = "+ b + "\n"+
								   "c = "+ c + "\n"+
								   "sum = " + sum + "\n"+
								   "GPA = "+ calculatGPA(sum)+"\n");
			}else {
				System.out.println("value < 0 or > 100");
			}

		}catch(Exception e) {
			System.out.println("Error type\n");
		}
		}while(!a.equalsIgnoreCase("q") || !b.equalsIgnoreCase("q") || !c.equalsIgnoreCase("q"));
		System.out.println("end");
		scanner.close();
	}


	private static String calculatGPA(int sum) {

		if(sum >= 80 && sum <= 100) {
			return "A";
		}else if(sum >= 75 && sum <= 79) {
			return "B+";
		}else if(sum >= 70 && sum <= 74) {
			return "B";
		}else if(sum >= 65 && sum <= 69) {
			return "C+";
		}else if(sum >= 60 && sum <= 64) {
			return "C";
		}else if(sum >= 55 && sum <= 59) {
			return "D+";
		}else if(sum >= 50 && sum <= 54) {
			return "D";
		}else {
			return "F";
		}

	}

}
