package interview_preparation;

import java.util.Scanner;

public class SeriesSum {
	static double sum(int number) {
		double i,s=0.0;
		for(i=2;i<=number;i++)
			s= s +1/i*i*i;
		return s;
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter range");
		int number = n.nextInt();
		System.out.printf("Sum of Series %f",sum(number));

	}
	
	

}
