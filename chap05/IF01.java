package select;

import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		//세 개의 숫자를 입력
        Scanner input = new Scanner(System.in);
        System.out.println("세 개의 숫자를 입력하세요.");
        int ent1 = input.nextInt();
        int ent2 = input.nextInt();
        int ent3 = input.nextInt();
        
		// 최대값 구하기
		int max = ent1;
		
		//b를 조사
		if (ent1 > max) {
			max = ent2;
		}
		
		//c를 조사
        if (ent2 > max) {
        	max = ent3;
        }
        
		//최대값 출력
        System.out.println("가장 큰 수는 " + max + "입니다.");
 	}
}

