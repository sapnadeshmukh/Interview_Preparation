package interview_preparation;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number");
		int num=s.nextInt();
		
		int index=0;
		int  var=0;
		for (; num != 0; num /= 10 ) {
			index=num%10;
			var=var*10 +index;
			
		}
		
	 
    System.out.println(var);
	
	}


}
