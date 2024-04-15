package chap02;

public class ReverseArray_2 {

	public static void main(String[] args) {
		
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0, j = numArr.length - 1; i < numArr.length / 2; i++, j--) {
			
			int x = numArr[i];
			
			numArr[i] = numArr[j]; 
			
			numArr[j] = x;	
		}
		for (int u = 0; u < numArr.length; u++) {
			System.out.print(numArr[u] + " ");
		}

	}

}
