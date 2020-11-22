package sel.swe.colle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	String name;
	int rollNo;
	int age;

	Student(String name, int rollNo, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

}

public class ArrListExamp {

	public static void main(String[] args) {
		// Generic ArrayList
		// Iterating through for each loop
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Dhoni");
		ar.add("Ravi");
		ar.add("Vijay");
		ar.add("Ravi");
		ar.add("Ajay");
		System.out.println(ar);
		System.out.println("Elements in the ArrayList are-->");
		for (String s : ar) {
			System.out.println(s);
		}

		// Non-generic ArrayList
		// Iterating through Iterator
		ArrayList nonar = new ArrayList();
		nonar.add("swetha");
		nonar.add(7149);
		nonar.add("Birth");
		nonar.add(17.77);
		System.out.println(nonar);
		Iterator it = nonar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Storing Student class object in array list.
		// Iterating through for loops
		Student student1 = new Student("Swetha", 1254, 26);
		Student student2 = new Student("Harika", 1224, 27);
		Student student3 = new Student("Deepika", 1234, 23);
		Student student4 = new Student("ram", 1274, 26);
		ArrayList<Student> stdlist = new ArrayList<Student>();
		stdlist.add(student1);
		stdlist.add(student2);
		stdlist.add(student3);
		stdlist.add(student4);
		Iterator itr = stdlist.iterator();
		// while (itr.hasNext()) {
		// Student st = (Student)itr.next();
		// System.out.println(st.name+" "+st.rollNo+" "+st.age);
		// }

		for (Student print : stdlist) {
			System.out.println(print.name + " " + print.rollNo + " " + print.age);
		}
		
		

	}

}