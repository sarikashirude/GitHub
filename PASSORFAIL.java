package Introduction;

import java.util.Scanner;

public class PASSORFAIL {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Marks");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>35)
		{
		System.out.println("Your Result IS Pass");
		}
		if(a<35)
		System.out.println();
		System.out.println("Your Result IS Fail");
	}

}
