package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하세요 :");
		
		 int a = Integer.parseInt(input.next());
		//String tempA = input.next();
		//int a = Integer.parseInt(tempA);
        
		
		int b = Integer.parseInt(input.next());
		int c = Integer.parseInt(input.next());
		
		int max = a;
		
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("가장 큰 수는 " + max + "입니다." );
		
			
	}

}
