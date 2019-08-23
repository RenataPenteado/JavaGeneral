package j20.java.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Candy {
	private Date factoryDate;
	private Date validity;
	private SimpleDateFormat dtf;
	public String name;
	public String flavor;
	
	Candy(String name, String flavor, String factoryDate){
		this.name = name;
		this.flavor = flavor;
		this.setFactoryDate(factoryDate);
		
	}
	
	private void setFactoryDate(String factoryDate) {
		try {
			this.dtf = new SimpleDateFormat("dd/MM/yyyy");
			this.factoryDate = dtf.parse(factoryDate);
			this.validity = calculateValidity(this.factoryDate);
		} catch (ParseException e) {
			System.out.println("The Factory date should be \"dd/MM/yyyy\"");
		}
	}
	
	private Date calculateValidity(Date factoryDate) {
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(factoryDate);
		cal.add(Calendar.MONTH, 1);
		return cal.getTime();
	}
	
	@Override
	public String toString() {
		return "Candy [name=" + this.name + ", "
				+ "flavor=" + this.flavor +", factoryDate=" + dtf.format(this.factoryDate) + ", "
						+ "validity=" + dtf.format(this.validity) + "]";
	}
	
}
