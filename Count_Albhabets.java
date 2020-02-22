package interview_preparation;

import java.util.Scanner;

public class Count_Albhabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text :- ");
		String text = sc.nextLine();

		int alphabets = 0;
		int spaces = 0;
		int digits = 0;

		int index;
//	    To get integer value of each character ,digit,space..
//		char s=' ';
//		System.out.println((int)(s));
		for (index = 0; index < text.length(); index++) {
			if (text.charAt(index) == 32)
				spaces++;
			if ((text.charAt(index) >= 97 && text.charAt(index) <= 122)
					|| (text.charAt(index) >= 65 && text.charAt(index) <= 90))
				alphabets++;
			if (text.charAt(index) >= 48 && text.charAt(index) <= 57)
				digits++;
		}
		System.out.println("No. of Alphabets = " + alphabets);
		System.out.println("No. of Digits = " + digits);
		System.out.println("No. of Whitespaces = " + spaces);
		

	}
}
