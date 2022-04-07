package Introduction;

import java.util.Scanner;

public class Percentage_or_Grade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome TO The Percentage");
     float total = 0;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter Total Mark OF The Subject");
     int total_marks  = input.nextInt();
     
     System.out.println("Enter The Marks OF Subject 1");
     float s1 = input.nextFloat();
     total = total+s1;
     
     System.out.println("Enter The Marks OF Subject 2");
     float s2 = input.nextFloat();
     total = total+s2;
     
     System.out.println("Enter The Marks OF Subject 3");
     float s3 = input.nextFloat();
     total = total+s3;
     
     System.out.println("Enter The Marks OF Subject 4");
     float s4 = input.nextFloat();
     total = total+s4;
     
     System.out.println("Enter The Marks OF Subject 5");
     float s5 = input.nextFloat();
     total = total+s5;
     float grandTotal = total*100/(total_marks*5);
     System.out.println("Your Total Percentage = "+ grandTotal + " %");
     if(grandTotal>90)
     {
    	 System.out.println("Grade IS A");
     }
     if(grandTotal<95 && grandTotal>=80)
     {
    	 System.out.println("Grade IS B");
     }
     if(grandTotal<80 && grandTotal>=60)
     {
    	 System.out.println("Grade IS C");
     }
     if(grandTotal<60 && grandTotal>=35)
     {
    	 System.out.println("Grade IS D");
     }
     
     System.out.println("THANKU YOU"); 
     System.out.println("MADE BY SARIKA");
	}

}
