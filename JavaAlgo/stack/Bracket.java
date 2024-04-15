package stack;

import java.util.Scanner;

public class Bracket {
	private char[] open = {'(', '{', '['};
	private char[] close = {'}', '}', ']'};
 	private char[] bArr;
	
	CharStack brStack = new CharStack(64); // 최대 64개를 푸시할 수 있는 스택
	
	Bracket() {
		Scanner sc = new Scanner(System.in);
		System.out.print("괄호 문자열 : ");
		char[] pArr = sc.nextLine().toCharArray();
		this.bArr = pArr;
	}
	public void findBracket() {
	int count = 0;
	 for (char c : bArr) {
		 if (count == '(') {
			 count++;
		 }
		 else if (count == '{') {
			 count++;
		 }
		 else if (count == '[') {
			 count++;
		 }
		 divideBracket(c, count);
	 }
	}
 	public void divideBracket(char c, int count) {
 		// 재귀, 소 중 대순으로 차례대로 오는걸 배열에 넣어서 따로 비교해보기	
 		char[] bsocket = new char[count];
 		for (int i = 0; i < count; i++) {
 			bsocket[i] = c;
 		}
 		
 		
 		
 		
 		findBracket();
 	
 	}

 	public boolean bracketFlag() {
		if (!brStack.isEmpty()) { 
				return false;
		}
		
		return true;
	}
	public void result() {
		String result = bracketFlag() ? "YES" : "NO";
		System.out.println(result);
	}
}