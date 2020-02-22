package interview_preparation;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter for start number");
		int start=s.nextInt();
		System.out.println("Enter for end number");
		int end=s.nextInt();
		int i;
		for(i=start;i<=end;i++) {
		if (isPrime(i))
		
			System.out.print(i+"\t");
		}

		
	}
	
	
	
	
	

	static boolean isPrime(int number) {

		int i, factors = 0;
		for (i = 1; i <= number; i++)
			if (number % i == 0)
				factors++;

		if (factors == 2)
			return true;
		else
			return false;
	}

}
