package j02.basic.objects.ex07;

public class TractorToy {
	String material = "plastico";
	String color = "verde";
	String marca = "grow";
	
	public TractorToy() {
	}

	public TractorToy(String material, String cor, String marca) {
		this.material = material;
		this.color = cor;
		this.marca = marca;
	}

	public TractorToy(String marca) {
		this.marca = marca;
	}
	
	
}
