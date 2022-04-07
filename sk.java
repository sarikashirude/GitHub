package Introduction;

import java.util.Scanner;

public class sk {

	public static void main(String[] args) {
		// Minute to Year Convertor
		System.out.println("Welcome Minute To Year Convertor");
		System.out.println("Please Enter value in Minute ");
		Scanner input= new Scanner(System.in);
		double minute = input.nextDouble();
		double ans =minute/525600;
		System.out.println("Ans Is "+ ans + " Year ");
	}

}
