package Loop;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("팩토리얼 숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 int factorial = 1;
		 
		 for (int c = num; c >= 1; c--) {
		   factorial *= c;	 
		 }
		 System.out.println(num + " = " + factorial);

	}

}
