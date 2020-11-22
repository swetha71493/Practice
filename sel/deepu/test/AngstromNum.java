package sel.deepu.test;

public class AngstromNum {

	public void getNum(int num) {
		int digits[] = new int[10];
		double digitSum = 0;
		for (int i = 0; i < 3; i++) {
			int digit = num % 10;
			digits[i] = digit;
			num = num / 10;
			System.out.println("Reverse No :" + digits[i]);

		}
		for (int j = 0; j < 3; j++) {
			System.out.println("Digits " + digits[j]);
			System.out.println("Cube of the digit: " + Math.pow(3, digits[j]));
			digitSum = Math.pow(3, digits[j]) + (digitSum);
			System.out.println("Sum of the cubes of the digits: " + digitSum);
		}
		if (digitSum == num) {
			System.out.println("Number is angstrom");
		} else {
			System.out.println("Number is not angstrom");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AngstromNum obj = new AngstromNum();
		obj.getNum(153);

	}

}
