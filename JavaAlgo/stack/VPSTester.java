package stack;

import java.util.Scanner;

public class VPSTester {
		
	public static void main(String[] args) {
		//스택 객체 생성
		CharStack vpsStack = new CharStack(64); // 최대 64개를 푸시할 수 있는 스택
		
		Scanner sc = new Scanner(System.in);
		System.out.print("괄호 문자열 : ");
		
		char[] pArr = sc.nextLine().toCharArray();		
		
		boolean isVPS = true;
		//확장된 for문
		for (char p : pArr) {
			if (p == '(') {
				// p가 여는 괄호이면 push
				vpsStack.push(p);
			} 
			else if (p == ')') 
			{
			// p가 닫는 괄호이면 getTop을 하여 짝꿍인지 확인한다
			if (vpsStack.getTop() == '(')
				//짝꿍이면 pop
				vpsStack.pop();        
			else {
				//아니면 iSVPS = false
				isVPS = false;
				break;
			}
		}
	}
	
	//문자열 끝까지 check했는데, stack에 남아있는 여는 괄호가 있으면,
	// isVPS = false;
	if (isVPS && !vpsStack.isEmpty()) 
		isVPS = false;
	
	
	String result = isVPS ? "YES" : "NO";
	System.out.println(result);
	}
}
