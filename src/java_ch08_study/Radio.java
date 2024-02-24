package java_ch08_study;

public class Radio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Radio turnOn");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio turnOff");		
	}

}
