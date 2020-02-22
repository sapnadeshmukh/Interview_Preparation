package interview_preparation;

import java.util.Scanner;

public class SubstractWithoutMinus {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a first Number");
		int num1=s.nextInt();
		System.out.println("Enter a Second Number");
		int num2 =s.nextInt();
		int sub=  num1 + ~num2 + 1;
		System.out.print(sub);


	}

}
