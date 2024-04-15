package chap03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
		do {
		  System.out.print("양의 숫자를 입력 : ");	
			
		  if (num < 0) {
			  break;
		  }
		  
		  num = sc.nextInt();
			
		  if (num % 2 == 0) {
				sum += num;
			}

		} while (num > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	
	}

}
