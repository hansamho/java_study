package second;

public class ExHandbag {

	public static void main(String[] args) {
		HandBag bag=new HandBag();
		bag.brand="샤넬";
		bag.name="플립 백";
		bag.price=10230000;
		
		System.out.println("bag.brand:"+ bag.brand);
		System.out.println("bag.name:" + bag.name);
		System.out.println("bag.price:"+ bag.price);
		System.out.println("==================");
		
		HandBag2 bag2=new HandBag2();
		bag2.brand="구찌";
		bag2.name="스몰 숄더백";
		bag2.price=3900000;
		
		System.out.println("bag2.brand:"+ bag2.brand);
		System.out.println("bag2.name:" + bag2.name);
		System.out.println("bag2.price:"+ bag2.price);
	}

}
