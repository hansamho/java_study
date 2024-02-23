package java_ch6;

public class CellPhone extends Phone { //extends: 상속 자식클래스가 부모클래스를 물려 받는다 부모클래스에 있는 모든 내용을 자식이 쓸수있음.
	
	private String telecom;

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	void cellPhonePowerOn() {
		System.out.println(getModel()+"의 전원을 킵니다.");
	}
	
	void cellPhonePowerOff() {
		System.out.println(getModel()+"의 전원을 끕니다.");
	}

	@Override   //재정의 phone의 함수를 재정의 한다.
	void powerOn() {
		System.out.println(getModel()+"의 전원을 킵니다."+"이 모델의 색깔은"+getColor());
	}

	@Override
	void powerOff() {
		System.out.println(getModel()+"의 전원을 끕니다."+"이 모델의 색깔은"+getColor());
	}
	
	
}
