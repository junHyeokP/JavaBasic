package Chap06;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person("길동이", 22);
		Student student = new Student("황진이", 23, 100);
		ForeignStudent foreignstudent = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		//person 타입 배열 생성
		Person[] personArr = {
			person, student, foreignstudent	
		};
	    
		for (Person human : personArr) {
			human.show();
		}
		
	}

}
