package java_ch6;

public class ExCellPhone {

	public static void main(String[] args) {
		CellPhone cellPhone=new CellPhone(); //객체생성자
		
		cellPhone.setModel("삼성");   //set 데이터를 저장
		cellPhone.setColor("블루");
		cellPhone.setTelecom("SKT");
		
		System.out.println("cellPhone.getModel():"+cellPhone.getModel());  //get 저장한 데이터를 불러오기
		System.out.println("cellPhone.getColor():"+cellPhone.getColor());
		System.out.println("cellPhone.getTelecom():"+cellPhone.getTelecom());
		System.out.println("==================");
		
		cellPhone.powerOn();  //powerOn 함수
		cellPhone.powerOff();
		
		System.out.println("===========");
		cellPhone.cellPhonePowerOn();
		cellPhone.cellPhonePowerOff();
		
		System.out.println("===============");
		
		cellPhone.powerOn(); //재정의한 함수를 호출
		cellPhone.powerOff();
	
	}

}
