package java_ch08_study;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Televsion turnOn");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Televsion turnOff");
		
	}
	
}
