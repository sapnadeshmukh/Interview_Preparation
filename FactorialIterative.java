package interview_preparation;

import java.util.Scanner;

public class FactorialIterative {
	
	


	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter number");
		int num =s.nextInt();
		int i,fact = 1;
		for (i=1;i<=num;i++ ) {
			fact=fact* i;
		}
		System.out.println(fact);
			 
		
	}
	

}
