package select;

import java.util.Scanner;

public class IF05 {

	public static void main(String[] args) {
		//숫자 입력
     Scanner input = new Scanner(System.in);
     System.out.print("양수를 입력 : ");
     int num = input.nextInt();
     
		//양수인 경우
     if (num > 0) {
          // 홀수, 짝수 판단	
        if (num % 2 == 0) {
        	System.out.println("짝수입니다.");
        }
        else {
        	System.out.println("홀수입니다.");
        }
     }
     else {
		//양수가 아닌 경우, 양수가 아니다
	    System.out.println("양수가 아닙니다.");
        }
     }
     

}
