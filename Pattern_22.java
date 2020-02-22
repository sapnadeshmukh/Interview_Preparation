package interview_preparation;

import java.util.Scanner;

public class Pattern_22 {
	static void spaceStar(int number) {
		int i;
		String space=" ";
		for(i=1;i<=number;i++) {
			for (int j=i;j<=number-1;j++) {
				System.out.print(space);
			}
			System.out.println("*" );
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number=s.nextInt();
		spaceStar(number);
	}

}
