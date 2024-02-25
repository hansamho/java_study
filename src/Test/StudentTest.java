package Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		
//		Student student1=new Student("Tony", 80, 75, 90);
//		
//		students.add(student1);
		
		
		students.add(new Student("Tony", 74, 75, 90));
		students.add(new Student("Tom", 85, 76, 88));
		students.add(new Student("Jennie", 88, 95, 69));
		
		for(Student  student: students) {
			System.out.println(student);
		}
		
		
		
	}

}
