package java_ch08_first;

public class Radio implements Remotecontrol {

	@Override
	public void turnOn() {
		System.out.println("Radio turnOn");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio turnOff");
		
	}
	
}
