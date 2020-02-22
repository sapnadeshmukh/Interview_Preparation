package interview_preparation;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = num.nextInt();
		System.out.print(a + " " + b + " ");

		for (int i = 1; i <= number; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}
	}

}
