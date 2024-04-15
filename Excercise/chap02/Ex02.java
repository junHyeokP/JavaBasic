package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
	    int s = sc.nextInt();
		System.out.println(s + "의 제곱은 "+ s*s);
	}

}
