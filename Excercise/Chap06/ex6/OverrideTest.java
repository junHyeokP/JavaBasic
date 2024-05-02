package Chap06;

public class OverrideTest {

	public static void main(String[] args) {
		//하나의객체가 여러가지 유형을 띄는 경우 (다형성)
		//자동 타입 변환과 오버라이딩으로 이해하기 쉬운 코드를 작성하는데 도움이 됨
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c; //Vehicle is a Car, 부모인 Vehicle 타입 변수에 c를 넣어 자동 형변환하기
		v.show();
		

	}

}
