package interview_preparation;

import java.util.Scanner;

public class Pattern_21 {

	public static void rightTriangle(int n) {

		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		rightTriangle(n);
	}

}
	
	


