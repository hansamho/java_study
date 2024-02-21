package java_ch07;

public class Phone {
	private String model;
	private String color;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	void PhoneOn() {
		System.out.println(model+"의 전원을 킵니다.");
	}
	
	void PhoneOff() {
		System.out.println(model+ "의 전원을 끕니다.");
	}
}
