package interview_preparation;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter How many elements Do you want in Array");
		int num = s.nextInt();
		int a[] = new int[num];
		System.out.println("Enter all elements ");
		for (int i = 0; i < num; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println("Ascending Oder is:");
		for (int i = 0; i < num - 1; i++) {
			System.out.print(a[i] + ", ");

		}
		System.out.print(a[num - 1]);

	}

}
