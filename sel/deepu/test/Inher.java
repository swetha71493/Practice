package sel.deepu.test;

class Parent {
	int a = 1;

	public void display() {
		System.out.println("In Parent");
	}
}

public class Inher extends Parent {
	int a = 10;

	public void display() {
		System.out.println("In child");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte k = 4;
		// byte j = 6;
		// byte sum=k+j;

		int a = 5;
		System.out.println("Printing a " + a);
		Parent obj = new Parent();
		obj.display();
		System.out.println("Printing through parent class intance: " + obj.a);
		Inher obj1 = new Inher();
		obj1.display();
		System.out.println("Printing through child class intance: " + obj1.a);
//		 System.out.println("Using this operator: " + this.a);
//		 System.out.println("Using super operator: " + super a);
		Parent obj3 = new Inher();
		obj3.display();
		System.out.println("Printing through parent class reference and child class intance: " + obj3.a);

	}

}
