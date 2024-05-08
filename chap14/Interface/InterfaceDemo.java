package chap14;

public class InterfaceDemo {
	
	class Icon {
		interface Touchable {
			void touch();
		}
	}
	
	//public으로 했을 땐 안되고 static으로 접근자를 설정하니까 동작?
	//정적 클래스는 외부 클래스보다 먼저 생성된다고 함
	static class InnerInterfaceDemo implements Icon.Touchable {
		public void touch() {
			System.out.println("아이콘을 터치한다.");
		}
		
		public static void main(String[] args) {
			Icon.Touchable btn = new InnerInterfaceDemo();
			btn.touch();
		}
	}
}
