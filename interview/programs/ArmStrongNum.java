package interview.programs;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		int n;
		int k;
		System.out.println("Enter a number to check");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = n;

		System.out.println("kiis" + k);
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			System.out.println(r);
			sum = sum + r * r * r;
			System.out.println(sum);
			n = n / 10;
			System.out.println(n);

		}
		System.out.println("sum is " + sum);
		if (sum == k) {
			System.out.println(k + " is a Armstrong number");
		}
		else{
			System.out.println(k + " is not a Armstrong number");
		}

	}

}
