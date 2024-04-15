package classtest;

public class Circle {
	
	//Value Object : 객체를 값처럼 쓸 수 있고, 제약사항 중 하나는 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 변하지 않는다는걸 보장할 수 있는 클래스의 객체
	
	// 필드 : 객체의 상태를 표현 (객체 내부에 선언된 변수)
	public double radius;
	final double PI = 3.14;
	
	// 속성(동작) : 메소드로 객체 내부의 동작을 표현
	double calRadius(double radius) {
	this.radius = radius;
	return PI * radius * radius;
	}
	
	void Result() {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, calRadius(radius));
	}

}
