package j09.objects.lifecycle.ex03;

public class TestBoo {
	public static void main(String[] args) {
		SonOfBoo b = new SonOfBoo(60);
		SonOfBoo b2 = new SonOfBoo("uhull");
		System.out.println(b.getName());
		System.out.println(b2.getsize());
		
	}

}
