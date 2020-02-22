package interview_preparation;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		pattern(num);
	}
		
		
		static void pattern(int num) {
		int i;
		for (i=num;i>=0;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print (j+ " ");
			}
			System.out.println();
		}
	}

}
