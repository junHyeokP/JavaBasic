package chap02;

import java.util.Scanner;

public class Factorial_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int fact = num;
		
		for (int i = num - 1; i > 0; i--) {
			fact *=  i;
		}
		
		System.out.println(fact);
		

	}

}
