package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {
	
	public static int gettheKeyboard(String message)throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(message);
		return Integer.parseInt(buff.readLine());
	}
	
	public static int[] getScoresLine(int num)throws IOException {
		// 정수 array생성
		int [] myArr = new int[num];
		//한 줄 읽어오기
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String str = buff.readLine();
		// 쪼개서 정수로 변환해서 배열에 저장하기
		StringTokenizer tok = new StringTokenizer(str, " ");
		for (int i = 0; i < num; i++) {
			myArr[i] = Integer.parseInt(tok.nextToken());
		}
		// 배열의 주소를 반환
		return myArr;
	}
	public static void printSumAverage(int[] myArr) {
		int sum = 0;
		
		for (int t = 0; t < myArr.length; t++) {
			sum += myArr[t];
		}
		int average =  sum / myArr.length;
		System.out.println("합계 : " + sum + "(" + myArr.length + "명)");
        System.out.println("평균 : " + average);
		
	}

	public static void main(String[] args)throws IOException {
		int numStudent = gettheKeyboard("학생 수: ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);

	}

}
