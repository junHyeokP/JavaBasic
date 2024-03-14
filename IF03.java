package select;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//숫자 입력
        System.out.print("숫자를 입력하세요 : ");
        int num = input.nextInt();
        
		//양수 , 0, 음수
        if (num > 0) {
        	System.out.print("양수입니다.");
        }
        else if (num == 0) {
        	System.out.print("0입니다.");
        }
        else {
        	System.out.print("음수입니다.");
        }
	}

}
