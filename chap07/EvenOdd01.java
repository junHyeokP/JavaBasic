package Method;

import java.util.Scanner;

public class EvenOdd01 {

	public static void decideEvenOdd() {
		//숫자를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		//짝수, 홀수 판단하여 출력
		if (num % 2 == 0) {
			System.out.println(">> 짝수입니다.");
		}
		else {System.out.println(">> 홀수입니다.");}
		}

	public static void main(String[] args) {
		//1이면 계속, 0이면 먼춤
				int bContinue = 1;
				
				while (bContinue != 0) {
					
			    decideEvenOdd();
			
				System.out.print("계속 하시겠습니까? 0 = 멈춤 // 1 = 계속 : ");
				Scanner sc = new Scanner(System.in);
				bContinue = sc.nextInt();
				}
				System.out.println("작동을 정지합니다.");
			

	}

}
