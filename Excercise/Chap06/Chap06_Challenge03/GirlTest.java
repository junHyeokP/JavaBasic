package Chap06_Challenge03;

public class GirlTest {

	public static void main(String[] args) {
		
		Girl[] girls = { new Girl("갑순이")
					   , new GoodGirl("콩쥐")
					   , new BestGirl("황진이")	
					   };
		
		//Girl 타입 변수 g에 girls 배열에 있는 객체들을 넣어 show 메서드를 호출, show 메서드는 g에 들어오는 타입에 따라 출력 결과가 바뀜.(다형성)
		for (Girl g : girls) {
			g.show();
		}

	}

}
