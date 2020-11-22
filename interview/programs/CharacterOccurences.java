package interview.programs;

public class CharacterOccurences {

	public static void main(String[] args) {
		String str = "helloooworrlllddd";
		int arr[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < 26; j++) {
				int k = 97 + j;
				if (ch[i] == (char) k) {

					arr[j]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println("Noof occurences of " + (char)(97 + i) + "is " + arr[i]);
			}
		}

	}

}
