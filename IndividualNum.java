package interview_preparation;

import java.util.Scanner;

public class IndividualNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for display individual");
		int input = s.nextInt();

		String inputStr = String.valueOf(input);

		for (char c : inputStr.toCharArray()) {
			System.out.println(c);

		}
	}

}
