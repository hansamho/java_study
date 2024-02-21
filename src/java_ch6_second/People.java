package java_ch6_second;

public class People {
	private String name;
	private String ssn;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	People(String name,String ssn){  //생성자
		this.name=name;       //this : people 클래스를 가리킴, 여기 name은 위 name과  같지않다.
		this.ssn=ssn;
	}
	People(){
		
	}
	
	void print() {
		System.out.println("이름은"+name);
	}
}
