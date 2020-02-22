package interview_preparation;

public class CountPrimeNum {
	static boolean countprime(int number) {
		int i;
		int factor=0;
		for(i=1;i<=number;i++) {
			if(number%i==0) {
				factor++;
			}
		}if (factor==2)
			return true;
		else 
			return false;
		

	}

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		int count=0;
		for (int i = start; i <= end; i++) {
			if (countprime(i)) {
				count++;
			}
			

		}
		System.out.println("prime numbers :" +count);
	}

}
