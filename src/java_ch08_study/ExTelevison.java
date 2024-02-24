package java_ch08_study;

public class ExTelevison {

	public static void main(String[] args) {
		Television television=new Television();
		television.turnOn();
		television.turnOff();
		
		System.out.println("=============");
		
//		RemoteControl television2= new Television();
//		television2.turnOn();
//		television2.turnOff();
		
		RemoteControl television2= new Radio(); //Radio로 객체 선언을 하고싶을때 Radio로 바꿔서 써준다
//		결과: Radio turnOn
//		     Radio turnOff
		television2.turnOn();
		television2.turnOff();
		television2.turnOn();
		television2.turnOff();
		television2.turnOn();
		television2.turnOff();
		television2.turnOn();
		television2.turnOff();
		
		
	}

}
