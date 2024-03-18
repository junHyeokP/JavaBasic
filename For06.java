package Loop;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		for (int c = 1; c <= 8; c++) {
			System.out.println("구구단 " + num + "단");
			for (int i = 1; i <= 9; i++) {
			 System.out.println(num + " x " + i + " = " + (num*i));
		 }
		num++;
		}
		
		 	
		 
	}
}
