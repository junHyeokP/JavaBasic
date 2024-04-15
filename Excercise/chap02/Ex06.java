package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//화씨 온도 F를 섭씨온도 C로 바꾸는 수식 : C = 5/9(F-32)
		//정수 타입을 사용하면 5/9는 0이 되므로 정확한 결과를 얻을 수 없다.
		double F = input.nextDouble();
		System.out.println((F-32)*5/9 + "°C");
         
	}

}
