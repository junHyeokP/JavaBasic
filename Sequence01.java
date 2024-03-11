package sequence;

import java.util.Scanner;

public class Sequence01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = input.nextInt();
		
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = input.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		
		
		
		System.out.println("Swapping 결과 > \n" + "변수 a의 값 = " + a + "\n" + "변수 b의 값 = " + b);
		

	}

}
