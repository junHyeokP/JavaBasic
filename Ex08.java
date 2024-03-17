package Exercise;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.next());
		int hundred = num/100;
		int hundred2 = num%100;
		int ten = hundred2/10;
		int onecount = hundred2%10;;
		
		if (num >= 1000) {
			System.out.println("1000을 넘겼습니다.");
		}
			
		 
				
         System.out.println("각 자릿수의 합 = " + (hundred + ten + onecount) +" 입니다.");
		
   
	}

}
