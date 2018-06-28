package Modifier;

public class Student {

	// 자바, 리눅스,C라는 점수를 담을 필드
	private int scoreJava, scoreLinux, scoreC;
	private String name, stuNumber;
	// 각 점수의 합계
	
	// 점수의 평균구하기
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String stuNumber) {
		super();
		this.name = name;
		this.stuNumber = stuNumber;
	}
	
	public Student(int scoreJava, int scoreLinux, int scoreC, String name, String stuNumber) {
		super();
		this.scoreJava = scoreJava;
		this.scoreLinux = scoreLinux;
		this.scoreC = scoreC;
		this.name = name;
		this.stuNumber = stuNumber;
	}	
	
	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreLinux() {
		return scoreLinux;
	}

	public void setScoreLinux(int scoreLinux) {
		this.scoreLinux = scoreLinux;
	}

	public int getScoreC() {
		return scoreC;
	}

	public void setScoreC(int scoreC) {
		this.scoreC = scoreC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	int sumScore()
	{
		return scoreJava + scoreLinux + scoreC;
	}
	
	int avgScore()
	{
		return sumScore()/3;
	}
	void print(int a)
	{
		
	}

	@Override
	public String toString() {
		return "Student [scoreJava=" + scoreJava + ", scoreLinux=" + scoreLinux + ", scoreC=" + scoreC + ", name="
				+ name + ", stuNumber=" + stuNumber + ", sumScore()=" + sumScore() + ", avgScore()=" + avgScore() + "]";
	}
	
	

	
	
	
}
