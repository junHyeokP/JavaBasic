package sequence;

import java.util.Scanner;

public class Sequence02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요(원) : ");
		int won1 = input.nextInt();		
		
		int n500 = (won1/500);
		int n100 =((won1%500)/100);
		
		
		
		System.out.println("500원 동전 "+n500+"개와"+" 100원 동전 "+n100+"개가 필요합니다");

	}

}
