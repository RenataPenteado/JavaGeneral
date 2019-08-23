package j10.numbers.handlers;

public class StaticSuper {
	static {
		System.out.println("super static block");
	}
	
	StaticSuper() {
		System.out.println("super constructor");
	}

}
