package j11.working.with.exceptions.ex05;

import java.io.Serializable;

public class Duck implements Serializable{
	private static final long serialVersionUID = 1L;
	static int countStatic;
	String color;
	int count;
	
	Duck(String color){
		this.color = color;
		this.count++;
		countStatic++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "color = " + this.color + ", count = " + this.count + ", countStatic = " + countStatic + "]";
	}


}
