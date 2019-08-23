package j08.inheritance.polymorphism.ex03;


public class SuperHeroesTest {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		PantherMan hp = new PantherMan();
		AntMan hof = new AntMan();
		
		System.out.println("SuperHero = " + sh.clothes);
		System.out.println(sh.changeClothes());
		System.out.println(sh.useSpecialPower());
		System.out.println();
		System.out.println("PantherMan = " + hp.clothes);
		System.out.println(hp.changeClothes());
		System.out.println(hp.usarPoderEspecial());
		System.out.println();
		System.out.println("AntMan = " + hof.clothes);
		System.out.println(hof.changeClothes());
		System.out.println(hof.useSpecialPower());
	}
}
