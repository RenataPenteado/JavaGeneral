package j09.objects.lifecycle.ex03;

public class Boo {
	private String name;
	private int size;

	public String getName() {
		return name;
	}
	public int getsize( ) {
		return size;
	}
	
	public Boo(int i) {
		size = i;
	}
	
	public Boo(String s) {
		name = s;
	}
	public Boo(String s, int i) {}
	
	

}
