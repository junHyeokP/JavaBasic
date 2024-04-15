package chap02;

import java.util.Scanner;

public class CardConv {

	public static void main(String[] args) {
		// 양의 숫자 입력받기
		int num = getPositiveNumber("양의 숫자 : ");
		// 멏 진수 변환할지 입력 받기 (뭘 몇 진수로 변환할까요(양수);
		int N = getPositiveNumber("변환할 진수 입력 : ");
		// n진수로 변환하기 (메서드)
		char[] cardNum = new char[64];
		int numDigit;
		numDigit = cardConv(num, N, cardNum);

		// 변환 결과 출력하기
		displayResult(cardNum, numDigit);
	}

	static int cardConv2(int num, char[] cardNum) {
		//2진수
		int numDigit = 0;
		String digitchar = "0123456789ABCDEFGHIJKLMONOPQRSRTWXYZ";

		while (num > 0) {
			cardNum[numDigit++] = digitchar.charAt(num % 2);
			num /= 2;
		}

		return numDigit;
	}

	static int cardConv(int num, int N, char[] cardNum) {
		//n진수
		int numDigit = 0;
		String digitchar = "0123456789ABCDEFGHIJKLMONOPQRSRTWXYZ";

		while (num > 0) {
			cardNum[numDigit++] = digitchar.charAt(num % N);
			num /= N;
		}

		return numDigit;
	}

	static void displayResult(char[] cardNum, int numDigit) {
		for (int i = numDigit - 1; i >= 0; i--)
			System.out.print(cardNum[i]);
		System.out.println();
	}

	static int getPositiveNumber(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while (num <= 0);
		return num;
	}
}
