package interview.programs;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter a nuber");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Number is " + num);

		for (int i = 1; i <= num; i++) {
			int count = 0;
			// System.out.println("i is " + i);
			for (int j = 1; j <= i; j++) {

				// System.out.println(i + "%" + j);
				if (i % j == 0) {
					count++;

					// System.out.println("Count is " + count);
				}

			}
			if (count == 2) {
				System.out.print(i + " ");
			}

		}
	}

}
