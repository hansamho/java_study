package java_ch06;

//import second.HandBag;

public class ExCar {

	public static void main(String[] args) {
		Car car=new Car();
		Car car4=new Car("Benz", "S class", 1, 503.12);
		
		
		car.brand="Benz";
		car.name="S class";
		car.carType=1;
		car.power=503.12;
		
		System.out.println("car.brand:"+ car.brand);
		System.out.println("car.name:" + car.name);
		System.out.println("car.carType:"+ car.carType);
		System.out.println("car.power:" + car.power);
		System.out.println("=====================");
		
		Car2 car2=new Car2();
		car2.brand="KIA";
		car2.name="K7";
		car2.carType=3;
		car2.power=300.12;
		
		System.out.println("car2.brand:" + car2.brand);
		System.out.println("car2.name:"+ car2.name);
		System.out.println("car2.carType:"+ car2.carType);
		System.out.println("car2.power:" + car2.power);
		System.out.println("================");
		
		SportsCar car3=new SportsCar();
		car3.brand="s";
		car3.name="람보르기니";
		car3.carType=3;
		car3.power=405.12;
		
		System.out.println("car3.brand:"+ car3.brand);
		System.out.println("car3.name:"+ car3.name);
		System.out.println("car3.carType:"+ car3.carType);
		System.out.println("car3.power:"+ car3.power);
		
//		HandBag bag=new HandBag();  컨트롤 시프트 o
		
		car.go();
		car.back();
		car.left();
		car.right();
		System.out.println("====================");
		
		
		System.out.println("car4.brand:"+ car4.brand);
		System.out.println("car4.name:"+ car4.name);
		System.out.println("car4.carType:"+ car4.carType);
		System.out.println("car4.power:"+ car4.power);
		
	}

}
