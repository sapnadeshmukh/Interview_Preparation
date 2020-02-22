package interview_preparation;

public class SwapNum {

	public static void main(String[] args) {
		int x=8;
		int y=10;
		System.out.println("Before Swapping x is:" + x);
		System.out.println("Before Swapping y is:" +  y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping x is :" + x);
		System.out.println("After swapping y is :" + y);
		
		
	}

}
