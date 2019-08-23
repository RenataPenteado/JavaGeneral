package j02.basic.objects.ex09;

public class Test {
	public static void main(String[] args) {
				
		Duck d1 = new Duck("White");
		Duck d2 = new Duck("Yellow");
		Duck d3 = new Duck("Green");
		
		d2.count++;
		
		System.out.println(d1.print());
		System.out.println(d2.print());
		System.out.println(d3.print());
		
		System.out.println();
		System.out.println(Duck.countStatic);
		
		System.out.println();
		System.out.println(DuckCompair.duckWithMaxCounter(d1, d2).color);
	}
}
