package chap02;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
//		for(int star05 = 1; star05 < num+num; star05 += 2) {
//			   for(int s5 = num+num-1; s5 > star05; s5 -=2) {
//				   System.out.print(" ");
//			   }
//			   for(int s5 = 0; s5 < star05; s5++) {
//				   System.out.print(i%10);
//			   }
//			   System.out.println();
//		    })
//
//	}
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
