package interview_preparation;

import java.util.Scanner;

public class Convertion {

	public static void main(String[] args) {
		
//		//to convert string to int
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
//		int k=Integer.valueOf(str);  	//to convert string to int by using Integer.valueOf()
		int k=Integer.parseInt(str);    //to convert string to int by using Integer.parseInt()
		System.out.println(k);
		System.out.println(123+k);
		
		
		//to convert int to string

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a int num");
		int num=s1.nextInt();
//		String str1=Integer.toString(num);
		String str2=String.valueOf(num);
		System.out.println(str2);
		System.out.println("1234"+str2);
		
		
		
	}

}
