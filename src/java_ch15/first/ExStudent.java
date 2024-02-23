package java_ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		Student student=new Student();
		Student student2=new Student("Tom",70);
		
		students.add(student);
		students.add(student2);
		students.add(new Student("Tony", 80));
		
		for(Student student3: students) {
			System.out.println(student3.getName()+"|"+student3.getScore());
		}
	}

}
