package j11.working.with.exceptions.ex01;

public class Washer {
	Laundry laundry = new Laundry();
	
	public void foo() throws ClothingException {
		laundry.doLaundry();
	}
	public static void main(String[] args) throws ClothingException {
		Washer a = new Washer();
		a.foo ();
	}

}
