package Test;


public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public Student(String name, int korean, int english, int math) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
	}
	
	public Student() {
		
	}
	
	public int sum() {
		return korean+english+math;
	}
	
	public double avg() {
		double avg=sum()/3;
		return avg;
	}
	
	@Override
	public String toString() {
		return name+"의 국어점수는:"+korean+" "+"영어점수는:"+english+" "+"수학점수는:"+math+" " +"총점은:"+sum()+" "+"평균은:"+avg();
	}
	
	
}
