package java_ch07;

public class CellPhone extends Phone{
	private String telecom;

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	void CellPhoneOn() {
		System.out.println("전원을 킵니다.");
	}
	
	void CellPhoneOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	void PhoneOn() {
		System.out.println("CellPhone의 전원을 킵니다."); //재정의
	}

	@Override
	void PhoneOff() {
		System.out.println("CellPhone의 전원을 끕니다.");
	}
	
	
	
}
