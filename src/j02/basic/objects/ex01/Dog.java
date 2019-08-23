package j02.basic.objects.ex01;

public class Dog {
	int size;
	String breed;
	String name;
	
	
	
	Dog() {
		System.out.println("Constructor called!!");		
	}

	void bark() {
		System.out.println("ruff ruff");
	}
	
	String getBreed() {
		return this.breed;
	}
	
	String getNameMessage() {
		return "This dog is called " + this.name;
	}
	
	int getSize() {
		return this.size;
	}
	
	public static void main(String[] args) {
		Dog dd = new Dog();
		dd.size = 60;
		dd.name = "Madona";
		dd.breed = "Boder Coly";
		Cat cc = new Cat();
				
		dd.bark();
		String zzz = dd.getNameMessage();
		System.out.println(zzz);
	}
	
}
