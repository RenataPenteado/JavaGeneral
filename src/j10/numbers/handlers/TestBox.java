package j10.numbers.handlers;

public class TestBox {
	Integer i = 0;
	int j;
	
	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
	}
	public void go () {
		j=i;
		System.out.println(j);
		System.out.println(i);
		
		System.out.println(Math.min(88,  86));
	}

}
