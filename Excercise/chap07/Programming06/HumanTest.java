package chap07Programming02;
			
public class HumanTest {
			
	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20); // Student 타입의 Student 객체
		s.print();
		s.eat();
		
		Human p = new Worker(); // Human 타입의 Worker 객체
		p.print(); // Human 인터페이스에 있는 메서드 호출, 다형성으로 인하여 결과가 바뀜
		p.eat();
					
	}

}
