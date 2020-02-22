package interview_preparation;

import java.util.Scanner;

public class FibonacciByRecursion {
	static int recursion(int num) {
		if (num==0) {
			return 0;
		}
		else if (num==1) {
			return 1;
		}
	      return recursion(num-1) + recursion(num-2);

		
	}


	


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		for (int i=0;i<num;i++) {
			System.out.println(recursion(i));
		}
	}

}	
