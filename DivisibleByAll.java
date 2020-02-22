package interview_preparation;

public class DivisibleByAll {

	public static void main(String[] args) {
		
		for (int i=1;i<=3000;i++) {
			int b=0;
			for  (int j=1;j<=10;j++) {
				if ( i % j==0) {
					b++;
				}
				
			}
			if(b==10) {
				System.out.println(i);
			}
		}

	}

}

