package j02.basic.objects.ex07;

public class TesteBrinquedos {
	public static void main(String[] args) {
		AirplaneToy ab = new AirplaneToy();
		System.out.println(ab);
		CarToy cb = new CarToy("Steel", "Blue", "Star");
		System.out.println();
		TruckToy cmb = new TruckToy();
		System.out.println();
		TractorToy tb = new TractorToy("Steel", "Green", "Grow");
		System.out.println();
		TractorToy tb2 = new TractorToy("Star");
	}
}
