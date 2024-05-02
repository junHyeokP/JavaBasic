package Chap06;

public class Parent {
	//메서드는 자식클래스가 오버라이딩할 수 있지만, 필드는 오버라이딩할 수 없다.
	String name = "영조";
	
	void print() {
		System.out.println(this.name);
	}
}
