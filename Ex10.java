package chap03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 :");	
		int num = sc.nextInt();	

			if (isPrime(num)) {
				System.out.println(num +"은 소수 입니다.");	
								
				}
			else {System.out.println(num + "은 소수가 아닙니다.");}

			}
			
			static boolean isPrime(int num) {
			
			
				for (int i = 2; i <= num-1; i++) {
					if (num % i == 0) {
						return false;
					}
				}
					return true;
					
			}
			
		
}
