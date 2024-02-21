package java_ch07_second;

public class HandBag extends Bag {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void HandbagPrice() {
		System.out.println("HandBag의 가격:"+price);
	}


	@Override
	void Bagprint() {
		System.out.println("brand:"+getBrand()+"model:"+getModel()+"price:"+getPrice());
	}
	
	
}
