package j02.basic.objects.ex01;

public class TestDrive {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		
		Dog d = new Dog();
		d.size = 40;
		d.breed = "Rusk";
		d.name = "Diamond";
		
		d.bark();
		String xxxx = d.getNameMessage();
		System.out.println(xxxx);
		
		
	}
}
