package java_ch07_thrid;

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
	
	Student(String name,String ssn,int studentNo){
		super(name,ssn); //부모
		this.studentNo=studentNo;
	}
	
	Student(){
		
	}
}
