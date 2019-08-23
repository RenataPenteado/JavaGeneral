package j02.basic.objects.ex08;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this(new Double(1));
		this.name = name;
		this.age = age;
	}

	public Animal(Double d) {
		this(new String("word"));
	}
	
	public Animal(String s) {
		this();
	}
	
	public Animal() {
		super();
	}
	
}
