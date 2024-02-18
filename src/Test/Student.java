package Test;


public class Student {
	String name;
	int korscore;
	int engscore;
	int mathscore;
	int total;
	double avg;
	
	public Student(String name,int korscore,int engscore,int mathscore) {
		this.name=name;
		this.korscore=korscore;
		this.engscore=engscore;
		this.mathscore=mathscore;
	}
	
	
	public String getName() {
		return name;
	}
	

	public int getKorscore() {
		return korscore;
	}
	

	public int getEngscore() {
		return engscore;
	}

	
	public int getMathscore() {
		return mathscore;
	}
	
	
	
	

	public int getTotal() {
		return korscore+engscore+mathscore;
	}
	
	public double getAvg() {
		return getTotal()/3.0;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return name + ":" + "국어점수:" + korscore + "영어점수:" + engscore+"수학점수:" + mathscore+ "총점:"+getTotal()+ "평균:"+ getAvg();
	}
}
