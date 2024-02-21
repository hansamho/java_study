package java_ch07_second;

public class Bag {
	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	void Bagprint() {
		System.out.println("Bag의 브랜드:"+brand);
	}
}
