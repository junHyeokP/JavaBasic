package chap02;

import java.util.Random;

public class ReverseArray {

	public static void main(String[] args) {
		//랜덤 숫자 설정
		int num = theRandom();
		int[] numArr = new int[num];
		addNumber(numArr, num);
		
		// 배열 역순 정렬
        reverseArray(numArr);
		
		
		//배열 출력
        displayArray(numArr);
        
	}
	static void addNumber(int[] n, int a) {
		for (int i = 0; i < n.length; i++) {
			n[i] = theRandom();
		}
	}
	static int theRandom() {
		
	Random rd = new Random();
	int num = 3 + rd.nextInt(7);
	return num;
	}
	
	static void reverseArray(int[] numArr) {
		for(int i = 0; i < numArr.length / 2; i++) {
			swapArr(numArr, i, numArr.length - 1 - i);
		}
	}
	static void reversArray2(int[] numArr) {
		for (int i = 0, j = numArr.length - 1; i < numArr.length; i++, j--) {
			swapArr(numArr, i, j);
	    }
	}
	static void swapArr(int[] numArr, int source, int target) {
//		int a = numArr[source];
//		int b = numArr[target];
//		int temp = a;
//		a = b;
//		b = temp;
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;
	}
  
	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}
}
