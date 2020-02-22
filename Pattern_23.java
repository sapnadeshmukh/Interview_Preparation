package interview_preparation;

import java.util.Scanner;

public class Pattern_23 {
	static void numPattern(int number) {
		int num=1;
		for(int i=number;i>=0;i--) {
			for(int j=1;j<=i;j++ ) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number=s.nextInt();
		numPattern(number);
		
	

	}

}
