package Array;

public class Array04 {

		public static void main(String[] args) {

		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };

		int[][] sum = new int[rows][columns];
          int r = 0;
          int c = 0;
		// 두 행렬의 합을 구하는 코드 추가
	for ( r = 0; r < rows; r++) {
		for ( c = 0; c < columns; c++) {
			sum[r][c] = firstMatrix[r][c] + secondMatrix[r][c];
		}
	}
		// 구한 결과를 출력하는 코드 추가
	       System.out.println("두 행렬의 합: ");
	       for (r = 0; r < rows; r++) {
	    	   for (c = 0; c < columns; c++) {
	    		   System.out.print(sum[r][c] + " ");
	    	   }
	    	   System.out.println();
	    	   }
	           

	    
	

	}

}
