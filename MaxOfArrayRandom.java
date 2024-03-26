package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	
	public static void main(String[] args) {
		// 사람 수 입력 받기
		int num = getPositiveNumber("사람 수 : ");
		
		// 사람 수만큼 키를 랜덤 생성하여 배열에 저장
		int[] height = new int[num];
		getRandomArray(height, 100, 200);
		
		// 배열에서 가장 큰 값 찾기
		int max = maxOf(height);
		//출력
        System.out.println("가장 큰 키는" + max + "cm입니다.");
	}
    static void getRandomArray(int[] numArr, int start, int end) {
    Random rd = new Random();
  
    for (int i = 0; i < numArr.length; i++) {
        numArr[i] = start + rd.nextInt(end - start); //스타트 부터 엔드에 있는 숫자를 랜덤으로 만들어줌
        System.out.print(numArr[i] + " ");
    }
  System.out.println();

}

	
	static int getPositiveNumber(String message) {
    
		int num;
            	
            	Scanner input = new Scanner(System.in);
            	
            	do {
            		System.out.print(message);
            		num = input.nextInt();
            	}while (num <= 0);
            	
            	return num;
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
