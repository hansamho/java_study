package java_ch6_second;

public class Student extends People {
	private int studentNo;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	Student(int studentNo){
		this.studentNo=studentNo;
	}
	Student(String name, String ssn, int studentNo){
		super(name,ssn);
		this.studentNo=studentNo;
	}
	Student(){
		
	}

	@Override
	void print() {
		System.out.println("이름:"+getName() + "주민번호:" + getSsn()+"학번:"+studentNo);
	}
	
	
}
