package Loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("5개의 숫자 입력 : ");
		 int num = 0; int sum = 0;
		 
		 
		for (int i = 1; i <= 5; i++) {
			num = sc.nextInt();
			sum += num;
		}
           System.out.println("5개의 숫자의 합은 " + sum + "입니다.");
	}

}
