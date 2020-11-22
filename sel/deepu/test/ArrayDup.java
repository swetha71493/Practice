package sel.deepu.test;

class Arr {
	public void sortDupl() {
		int[] list = { 7, 5, 3, 7, 5, 3, 1, 6, 1, 7, 1 };
		System.out.println("duplicates are: ");
		for (int i = 0; i <= list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j]) {
					System.out.println(list[j]);
				}
			}

		}

	}
}

public class ArrayDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr c = new Arr();
		c.sortDupl();

	}

}
