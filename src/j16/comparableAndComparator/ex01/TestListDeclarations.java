package j16.comparableAndComparator.ex01;

import java.util.ArrayList;
import java.util.List;

public class TestListDeclarations {
	public static void main(String[] args) {
		// ArrayList<Dog> dogs1 = new ArrayList<Animal>(); // <- Incorreto
		// ArrayList<Animal> animals1 = new ArrayList<Dog>(); // <- Incorreto
		List<Animal> list = new ArrayList<Animal>(); // <- Correto
		ArrayList<Dog> dogs = new ArrayList<Dog>(); // <- Correto
		// ArrayList<Animal> animals = dogs; // <- Incorreto
		List<Dog> dogList =  dogs; // <- Correto
		ArrayList<Object> objects = new ArrayList<Object>(); // <- Correto
		List<Object> objList = objects; // <- Correto
		// ArrayList<Object> objs = new ArrayList<Dog>(); // <- Incorreto
		Animal a = new Dog(); // <- Correto
		// Dog d = new Animal(); // <- Incorreto
	}

}
