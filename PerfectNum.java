package interview_preparation;

import java.util.Scanner;

public class PerfectNum {
	static int checkperfect(int number) {
		int sum = 0;
		for (int i = 1; i <number; i++) {
			if (number % i == 0) 
				sum = sum + i;
			
		}
		return  sum ;
		
	
	}

	public  static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int number = s.nextInt();
		int num=checkperfect(number);
		
		if (num == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println(" Not Perfect Number ");
		}
	}

}
