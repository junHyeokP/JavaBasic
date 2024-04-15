package Array;

public class Array01 {

	public static void main(String[] args) {
		int[] gArray = {90, 70, 80, 79, 82, 50, 60, 90, 89, 77};
		
		int sum = 0;
		
		for(int t = 0; t < gArray.length; t++) {
			sum += gArray[t];
		}
		
		 int average = sum / gArray.length;
         
		 System.out.println("합계 : " + sum + "(" + gArray.length + "명)");
         System.out.println("평균 : " + average);
	}

}
