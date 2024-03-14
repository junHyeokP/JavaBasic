package select;

import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		//슛저룰 입력 받아 짝수인지 홀수인지 출력
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		switch (a % 2) {
		case 0 : System.out.println("짝수입니다.");	  
		break;
		case 1 : System.out.println("홀수입니다.");
		break;
		default : System.out.println("숫자를 입력해주세요.");
		}
      
		
		
		
	}

}
