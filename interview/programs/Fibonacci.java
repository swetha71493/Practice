package interview.programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int num;
		int a = 1;
		int b = 1;
		System.out.println("Enter a nuber");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Number is " + num);
		if (num == 1 || num == 2) {
			System.out.print(a + " " + b + " ");
		} else {
			System.out.print(a + " " + b + " ");
			while (num > a + b) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;

			}
		}

	}

}
