package Chap06;

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
		//instanceof 연산자로 변수가 해당 타입이나 자식 타입이면 true를 반환, 아니면 false 반환.
		//for each문으로 변수 doyouwant의 타입을 바꿔가며 조사, doyouwant는 여전히 phone(부모) 타입일테니 강제로 형변환을 하여 자식 객체의 메서드를 호출하도록 변경
		//phone 타입을 먼저 instanceof로 조사하니 Phone에 있던 talk()메서드로 Phone에 담긴 데이터가 1번, Telephone 데이터 1번, Smartphone 데이터가 1번씩만 출력됨, 이는 아무래도 먼저 phone 객체를 조사할때 instanceof 연산자가 자식 객체들까지 포함해버려서 그런것으로 추정.
		for (Phone doyouwant : phones) {
			if (doyouwant instanceof Smartphone) {
				((Smartphone)doyouwant).playGame();
			}
			else if (doyouwant instanceof Telephone) {
				((Telephone)doyouwant).autoAnswering();
			}
			else if (doyouwant instanceof Phone) {
				doyouwant.talk();
			}
		}

	}

}
