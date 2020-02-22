package interview_preparation;

import java.util.Scanner;

public class FatorialRecursive {
	static int factorial(int num) {

		{
			int fact;

			if (num == 0) {
				return 1;
			}else {

			fact = factorial(num - 1) * num;
			return fact;
			}

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		System.out.println(factorial(num));

	}

}
