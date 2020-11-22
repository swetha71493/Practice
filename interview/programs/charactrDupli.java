package interview.programs;

public class charactrDupli {
	public static void main(String[] args) { 
		String str="helloworld";
		char[] arr = str.toCharArray();
//		System.out.println( arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}			
		}
//		for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i]);
//		}
		// for(int i=0;i<arr.length;i++)
		// System.out.println(arr[i]);

		for (int i = 0; i < arr.length; i++) {
			try {
				if (arr[i] != arr[i + 1])
					System.out.print(arr[i]);

				// System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.print(arr[i]);

			}
		}
	}
}
