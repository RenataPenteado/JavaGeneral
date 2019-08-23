package j08.inheritance.polymorphism.ex04;

import java.util.ArrayList;

public class TestAnimals {
	public static void main(String[] args) {		
		
		Dog a1 = new Dog();
		Cat a2 = new Cat();
		Lion a3 = new Lion();
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(a1);
		al2.add(a2);
		al2.add(a3);
		
		System.out.println( ((AnimalInterface) al2.get(0)).giveShout() );
		System.out.println( ((AnimalInterface) al2.get(1)).giveShout() );
		System.out.println( ((AnimalInterface) al2.get(2)).giveShout() );
		
		
	}
}
