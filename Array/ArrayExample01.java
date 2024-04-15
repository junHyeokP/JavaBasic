package Array;

public class ArrayExample01 {

	public static void main(String[] args) {
		int[][] Arr = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15}
		};
		
		for (int row = 0; row < 3; row++) {
			for(int col = 0; col < 5; col++) {
				System.out.print(Arr[row][col] + " ");
			}
			System.out.println();
		}
         System.out.println("Arr[0][1] 값 : " + Arr[0][1]);		
	}

}
