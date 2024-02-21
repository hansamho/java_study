package java_ch6_second;

public class ExStudent {

	public static void main(String[] args) {
		Student student =new Student(16426037);
		System.out.println("student.getStudentNo():"+student.getStudentNo());
		System.out.println("============");
		
		
		Student student2=new Student("Tony","123",16426037);
		System.out.println("student2.getName():"+student2.getName());
		System.out.println("student2.getSsn():"+student2.getSsn());
		System.out.println("student2.getStudentNo():"+student2.getStudentNo());
		System.out.println("=============");
		
		student2.print();
	}

}
