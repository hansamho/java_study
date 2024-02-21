package java_ch07;

public class ExCellPhone {

	public static void main(String[] args) {
		Phone phone=new Phone();
		
		phone.PhoneOn();  //set 하기 전이라 데이터가 null값
		phone.PhoneOff();
		
		phone.setModel("클래식 전화기");
		phone.setColor("검은색");
		
		System.out.println("phone.getModel():"+phone.getModel());
		System.out.println("phone.getColor():"+phone.getColor());
		
		phone.PhoneOn(); //set 이후 데이터가 들어감
		phone.PhoneOff();
		
		CellPhone cellphone=new CellPhone();
		cellphone.setTelecom("SKT");
		cellphone.setModel("삼성");
		cellphone.setColor("블루");
		
		
		System.out.println("===================");
		
		System.out.println("cellphone.getTelecom():"+cellphone.getTelecom());
		System.out.println("cellphone.getModel():"+cellphone.getModel());
		System.out.println("cellphone.getColor():"+cellphone.getColor());
		
		cellphone.CellPhoneOn();
		cellphone.CellPhoneOff();
		
		System.out.println("====================");
		
		cellphone.PhoneOn(); //재정의 한 값 출력
		cellphone.PhoneOff();
		
	}

}
