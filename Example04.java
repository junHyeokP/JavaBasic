package Loop;

public class Example04 {

	public static void main(String[] args) {
		//이중 for문 예제

		for (int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + "," + j);
			}
		}
		
		//for문에 두개 이상의 정수가 들어갈 수도 있음
     for(int t = 1, o = 2; t <= 5; t++, o++) {
    	 System.out.println("\n" + t + "," + o);
     }
	}

}
