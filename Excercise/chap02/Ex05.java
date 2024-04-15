package chap02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char s = sc.nextLine().charAt(0);
		int q = (int)s;
		int w = q-32;
		char f = (char)w; 
		
		System.out.println(f);

	}

}
