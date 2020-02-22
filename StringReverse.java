package interview_preparation;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		System.out.println(reverseString(str));
	}
	static String reverseString(String str){  

		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;  
		}  
	

}
