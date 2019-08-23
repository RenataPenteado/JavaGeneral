package j10.numbers.handlers;

public class Foo {
	int x = 15;
	
	public static void go(final int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new Foo().go(10);
		
//		Foo f = new Foo();
//		f.go();
	}

}
