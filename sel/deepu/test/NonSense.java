package sel.deepu.test;

import java.util.Scanner;

public class NonSense {

	public void testM(String str) {
		int count[] = new int[256];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		char ch[] = new char[len];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("No of occrences of " + str.charAt(i) + " is " + count[str.charAt(i)]);

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "iloveindiamore";
		NonSense obj = new NonSense();
		obj.testM(str);

	}

}
