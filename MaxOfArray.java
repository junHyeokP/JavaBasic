package chap02;


public class MaxOfArray {
	
	public static void main(String[] args) {
		
		
		int[] numArr = {32, 45, 67, 30, 69};
		
		int max = maxOf(numArr);
		
		System.out.println("최대값은 " + max + "입니다.");
	}
		static int maxOf(int[] numArr) {
		
			int max = numArr[0];
		 /// if (numArr == null) {} 값으로 null이 들어왔을시 예외처리.
		 
		 for(int i = 1; i < numArr.length; i++) {
			 if (numArr[i] > max) {max = numArr[i];}
		 }
			 return max;
		 
		}
	

}
