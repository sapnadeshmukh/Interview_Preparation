package interview_preparation;

import java.util.Scanner;

public class SumOfSeries {
	static double series(int num) {
		double i, sum = 0.0;

		for (i =1; i <= num; i++)
			sum = sum + 1 / i;

		return sum;

	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = n.nextInt();
        System.out.printf("Sum is %f", series(num) ); 
	
	}
	
}
