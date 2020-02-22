package interview_preparation;

import java.util.Scanner;

public class Pattern_19 {
	static void triangle(int number) {
		int i;
		int num=1;
		for(i=1;i<=number;i++) {
			for (int j=1;j<=i;j++)	{
//			System.out.print(j);
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number");
		int number=s.nextInt();
		triangle(number);
		    

	}

}
