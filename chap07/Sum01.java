package Method;

import java.util.Scanner;

public class Sum01 {
	
	public static int getInput(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	    public static int getSum(int n){ //이름은 바뀌어도 되지만 형 변환은 안됨.
			int sum = 0;
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			return sum;
//System.out.println(sum);			
}
	public static void printScreen(int value) {
		System.out.println(value);
	}
	public static void printScreen(int value, String massage) { //매개 변수는 여러개 지정이 가능
		System.out.println(massage + value);
	}
	public static void main(String[] args) {
		//1. 입력받기
	    int num;
		//2. 숫자가 양수이면 계속
	    while ((num = getInput("양의 숫자를 입력하세요 : ")) > 0) { //4. 1번 반복
		//3. 1 부터 숫자까지 더하기
	    int result = getSum(num);
		
		// 4. 더한 값을 출력하기
//	     printScreen(result);
	    printScreen(result, "합계 : ");
	    }
	    System.out.println("종료");

	}

}
