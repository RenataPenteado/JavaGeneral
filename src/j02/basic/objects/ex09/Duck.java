package j02.basic.objects.ex09;

public class Duck {
	static int countStatic;
	String color;
	int count;
	
	Duck(String cor){
		this.color = cor;
		this.count++;
		countStatic++;
	}
	
	String print() {
		return "Duck [ color = " + this.color + ", count = " + this.count + ", countStatic = " + countStatic + "]";
	}
	
	public static void main(String[] args) {
		Duck d1 = new Duck("White");
		Duck d2 = new Duck("Yellow");
		Duck d3 = new Duck("Green");
		
		d2.count++;
		
		System.out.println(d1.print());
		System.out.println(d2.print());
		System.out.println(d3.print());
	}
}
