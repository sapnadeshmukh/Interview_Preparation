package interview_preparation;

import java.util.Scanner;

public class PrimeDigit {
	static int digit(int num) {
		int factor = 0;
		int i = 0;
		int a = 0;

		while (num != 0) {
			num = num / 10;
			for (i = 1; i <= num; i++) {
				factor++;
			}
		}
		if (factor == 2) {
			a = i;

		}
		result a;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		System.out.println(digit(num));

	}

}
