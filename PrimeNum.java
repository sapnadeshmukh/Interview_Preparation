package interview_preparation;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int result=2;
		int index;
		Scanner s=new Scanner(System.in) ;
		System.out.println("Enter number to check prime or not");
		int num=s.nextInt();		
		for(index=2;index<=num/2;index++) {
			if (num%index==0) {
				result++;
				break;
			}
		}
		if (result==2) {
			System.out.println("It is prime number");
			
		}else {
			System.out.println("It is not prime number");
		}
	}

}
