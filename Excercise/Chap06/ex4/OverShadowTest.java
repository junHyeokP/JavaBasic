package Chap06;

public class OverShadowTest {

	public static void main(String[] args) {
		
		//parent 타입 p를 Child의 인스턴스 객체로 지정해놓기
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
		

	}

}
