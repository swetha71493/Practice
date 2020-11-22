package interview.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DupRemString {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter string: ");
		Scanner scn = new Scanner(System.in);
		s = scn.nextLine();
		char[] str = s.toCharArray();
		System.out.print("char array ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(str[i]);
		}
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(str[i]);
		}
		System.out.println("After Remove ");
		for (char fin : set) {			
			System.out.print(fin);
		}

	}

}
