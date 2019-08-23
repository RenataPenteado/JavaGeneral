package j08.inheritance.polymorphism.ex03;

public class SuperHero {
	String clothes;
	String mesh;
	String weapon;
	String specialPower;
		
	SuperHero(){
		clothes = "Summer style";
		mesh = "cotton";
		weapon = "sword";
		specialPower = "Fire";		
	}
	
	public String useSpecialPower() {
		return "Throw fire by " + weapon;
	}
	
	public String changeClothes() {
		return "Change clothes into 30 seconds!!";
	}
}
