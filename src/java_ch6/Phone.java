package java_ch6;

public class Phone {  //부모 클래스
	private String model; //private 접근생성자 이 클래스 안에서만 사용 가능 get/set 만들어야함
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
	
	void powerOn() {
		System.out.println(model+"의 전원을 킵니다."); //함수 생성
	}
	
	void powerOff() {
		System.out.println(model+"의 전원을 끕니다.");
	}
}

