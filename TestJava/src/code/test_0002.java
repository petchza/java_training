package code;

import java.util.Scanner;

public class test_0002 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number : ");
		int number = scanner.nextInt();

		//Why using "OR" condition
		if(number >= 1 || number <= 1000) {
			int array[] = new int[number];
			for(int i=1 ; i<=number ; i++) {
				array[i-1] = scanner.nextInt();
				if(array[i-1] < -2000000000 || array[i-1] > 2000000000) {
					System.out.println("error length");
					System.out.println("----------------");
					scanner.close();
					return;
				}
			}
			System.out.println("-------------------");
			System.out.println("Maximum Value is: "+getMax(array));
			System.out.println("Minimum Value is: "+getMin(array));

		}else {
			System.out.println("Error length number");
		}
		scanner.close();
	}

	public static int getMax(int[] inputArray){
	    int maxValue = inputArray[0];
	    for(int i=1;i < inputArray.length;i++){
	      if(inputArray[i] > maxValue){
	         maxValue = inputArray[i];
	      }
	    }
	    return maxValue;
	  }

	  public static int getMin(int[] inputArray){
	    int minValue = inputArray[0];
	    for(int i=1;i<inputArray.length;i++){
	      if(inputArray[i] < minValue){
	        minValue = inputArray[i];
	      }
	    }
	    return minValue;
	  }
}
