package java_ch06;

public class Car {
	String brand;
	String name;
	int carType;
	double power;
	
	
	private int aaa;
	
	Car(String brand,String name,int carType,double power){
		this.brand=brand;
		this.name=name;
		this.carType=carType;
		this.power=power;
	}
	Car(){
		
	}
	
	
	void go() {
		System.out.println("앞으로 갑니다");
	}
	void back() {
		System.out.println("뒤로 갑니다");
	}
	
	void left() {
		System.out.println("좌로 갑니다");
	}
	void right() {
		System.out.println("우로 갑니다");
	}
	
	
	public int getAaa() {            //값을 불러옴
		return aaa;
	}
	public void setAaa(int aaa) {    //값을 저장
		this.aaa = aaa;
	}
	
	
	
	
}
