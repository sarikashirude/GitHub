package Introduction;

import java.util.Scanner;

public class My_Bank {

	public static void main(String[] args) {
		System.out.println("Type Your Account Number");
		Scanner sc = new Scanner(System.in);
		long acc_no=sc.nextLong();
		if(acc_no<=9999999999999l)
		{System.out.println("Account Is Varified");}
		
		System.out.println("Enter The IFSC Code");
		String ifsc=sc.next();
		System.out.println("Please Select Following Option");
		System.out.println("Type 1 For check Balance");
		System.out.println("Type 2 For Money Transfer");
		int a=sc.nextInt();
		int balance=25000;
		if(a==1);
		{
		System.out.println("Your Account Balance IS "+balance);
		int b=sc.nextInt();
		if(b==2);
		{System.out.println("Plase account Number Is Benifisery");}
		long c=sc.nextLong();
		System.out.println("Please Enter Amount To Transfer The Benifisery");
		int d=sc.nextInt();
		int remaining = balance-d;
		System.out.println("Tranction Is Sucessful");
		System.out.println("Remaining BAlance IS "+remaining );
		System.out.println("Thank you");		
		}

	}

}
