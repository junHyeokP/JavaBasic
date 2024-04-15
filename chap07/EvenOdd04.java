package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EvenOdd04 {

	public static int getNumberKeyboard(String message)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(bf.readLine());
		
   
	}
	
	public static int decideEvenOdd(int num) {
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {System.out.println("홀수입니다. ");
		}
       return num % 2;
	}
	
	public static void printResultScreen(int flag)throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		
	}
	public static boolean isContinue() {
     return true;
	}
	
	public static void main(String[] args)throws IOException {
		int result;
		do {
			int num = getNumberKeyboard("숫자를 입력하세요 : ");
			result = decideEvenOdd(num);
			printResultScreen(result);
		} while (isContinue());
      System.out.println("종료합니다. ");
	}

}
