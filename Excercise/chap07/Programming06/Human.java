package chap07Programming02;

public interface Human {
	
	void eat();
	
	void print();
	
	static void echo() { //??
		System.out.println("야호");
	}
	
	
}


class Worker implements Human{ // 중첩 클래스, 인터페이스 Human을 상속받은 상태.
	
	public void print() {
		System.out.println("인간입니다.");
	}
	
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	
}

class Student implements Human{

	int age;
	
	Student(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(age + "세의 학생입니다.");
	}
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	
}