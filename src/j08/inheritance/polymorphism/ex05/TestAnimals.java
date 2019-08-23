package j08.inheritance.polymorphism.ex05;

import java.util.ArrayList;

public class TestAnimals {
	public static void main(String[] args) {		
		
		Dog a1 = new Dog();
		Cat a2 = new Cat();
		Lion a3 = new Lion();
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(a3);
		al2.add(a2);
		al2.add(a1);
		
		Object o = al2.get(0);
		System.out.println( ((AnimalAbstractClass) o).giveShout() );
		System.out.println( ((AnimalAbstractClass) al2.get(1)).giveShout() );
		System.out.println( ((AnimalAbstractClass) al2.get(2)).giveShout() );
		
		System.out.println( ((AnimalAbstractClass) al2.get(0)).breath() );
		System.out.println( ((AnimalAbstractClass) al2.get(1)).breath() );
		System.out.println( ((AnimalAbstractClass) al2.get(2)).breath() );
		
		for(int i=0; i<3; i++) {
			if(al2.get(i) instanceof Dog) {
				System.out.println("O objeto de indice " + i + " é um Dog");
			} else if (al2.get(i) instanceof Cat) {
				System.out.println("O objeto de indice " + i + " é um Cat");
			} else if( al2.get(i) instanceof Lion) {
				System.out.println("O objeto de indice " + i + " é um Lion");
			} else {
				System.out.println("O objeto não foi identificado");
			}
		}
		
		
	}
}
