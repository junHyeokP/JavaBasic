package Chap06;

public class Circle {
    //필드에 반지름 생성
	int radius;
	
	//생성자는 상속이 안됨
	Circle(int radius) {
		this.radius = radius;
	}
	
		void show() {
		// View
		System.out.println("반지름이 " + radius + "인 원이다");
	}
}
