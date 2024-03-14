package select;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		System.out.println("1. 아메리카노");
        System.out.println("2. 카페라떼");
        System.out.println("3. 카푸치노");
        System.out.print("메뉴 번호를 선택하세요 : ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt(); 
        switch (menu) {
        case 1 :
        case 2 :
        case 3 : System.out.print("몇 잔을 주문하시겠습니까? : ");
        int num = input.nextInt();
        System.out.println(menu + "번 메뉴 " + num + "잔 주문 받았습니다.");
        break;	
        default : System.out.println("없는 번호입니다.");
        
        }
        
	}

}
