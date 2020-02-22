package interview_preparation;

import java.util.Scanner;

public class PrintAP {
	static int show(int number, int start, int diff) {
		int curr_num;
		curr_num = start;
		int sum = 0;
		for (int i = 1; i <= number; i++) {

			sum = sum + curr_num;

			curr_num = curr_num + diff;

		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n  number");
		int number = s.nextInt();
		System.out.println(" Enter start number");
		int start = s.nextInt();
		System.out.println("Enter a diff");
		int diff = s.nextInt();

		System.out.println(show(number, start, diff));

	}

}
