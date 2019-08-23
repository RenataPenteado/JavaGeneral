package j11.working.with.exceptions.ex04;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		Dog d = new Dog();
		al.add(d);
		
		d = (Dog) al.get(0);		
		System.out.println(   d.bark()    );
		
		Object object = al.get(0);
		System.out.println(   ((Dog) object).bark()    );
		
		Object str = "Hello World";
		System.out.println(  ((Dog) str).bark()   );
		
	}
}
