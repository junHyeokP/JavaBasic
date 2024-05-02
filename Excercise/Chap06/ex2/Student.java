package Chap06;

public class Student extends Person {
	private int studentID;
	
	public Student(String name, int age, int studentID) {
	//super 메소드는 한번에 여러개의 부모 클래스의 필드변수를 호출하는게 가능하다
		super(name, age);
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}
	
	public void show() {
		System.out.println("학생[이름 : " 
				+ getName() + ", " + "나이 : " + getAge()
				+ ", " + "학번 : " + studentID + "]");
	}
	
}
