package chap02;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int x = 0;
		int j = numArr.length - 1;
		
		for (int i = 0; i < numArr.length / 2; i++, j--) {
			
			x = numArr[i];
			
			numArr[i] = numArr[j]; 
			
			numArr[j] = x;	
		}
		for (int u = 0; u < numArr.length; u++) {
			System.out.print(numArr[u] + " ");
		}
	
	}

}
