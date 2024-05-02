package Chap06;

public class ForeignStudent extends Student {
	private String nationality;
	
	public ForeignStudent(String name, int age, int studentID, String nationality) {
		super(name, age, studentID);
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void show() {
		System.out.println("학생[이름 : " 
				+ getName() + ", " + "나이 : " + getAge()
				+ ", " + "학번 : " + getStudentID() 
				+ ", " + "국적 : " + nationality + "]");
	}
}
