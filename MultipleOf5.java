package interview_preparation;

public class MultipleOf5 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum ="+ sum);
	}

}
