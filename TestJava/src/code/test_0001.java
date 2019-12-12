package code;

import java.util.Scanner;

public class test_0001 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String q = "";
		while(!q.equalsIgnoreCase("y")) {
		try {

			System.out.print("Enter a : ");
			int a  = scanner.nextInt();

			System.out.print("Enter b : ");
			int b  = scanner.nextInt();

			System.out.print("Enter c : ");
			int c  = scanner.nextInt();

			int sum = (a+b+c);

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
		System.out.println("Do you want to exit?");
		q = scanner.next();
		}
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
