package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Break01 {
	public static int Keyboard(String message)throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(message);
		return Integer.parseInt(buff.readLine());
	}
	
		public static void main(String[] args)throws IOException {
			int num = 0;
			int sum = 0;
		while (true) {
	    sum = 0;
		num = Keyboard("숫자 입력 : ");
		if (num <= 0) {
			System.out.println("0보다 큰 숫자를 입력하세요.");
		}
		else {break;}
	}
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터 " + num + "까지의 합 : " + sum);
		

	}

}
