package j20.java.util.date;

public class CandyStore {
	public static void main(String[] args) {
		Candy c1 = new Candy("Corn Cake", "Salty", "05/05/2005");
		
		c1.name = "Corn Cake";
		
		System.out.println(c1.toString());
		Candy c2 = new Candy("Carrot Cake", "Sweet", "10/02/2017");
		System.out.println(c2.toString());
	}
}
