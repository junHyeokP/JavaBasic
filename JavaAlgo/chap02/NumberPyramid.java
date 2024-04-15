package chap02;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int a = sc.nextInt();
		npira(a);
	}
  static void npira(int n) {
	  int c = 1;
	  for(int i = 1; i < n + n; i += 2) {
		for (int j = n+n-1; j > i; j -=2) {
			System.out.print(" ");
		}
		for(int j = 0; j < i; j++) {
			System.out.print(c);
		}
		c++;
		System.out.println();
	  }
  }
}
