package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args)throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("학생 수 : ");
		int numStudent = Integer.parseInt(buff.readLine());
		
		System.out.print(numStudent + "명의 성적 : ");
		String str = buff.readLine();
		StringTokenizer tok = new StringTokenizer(str, " ");
		
		int[] scores = new int [numStudent];
		
		int sum = 0;
		
		for (int i = 0; i < numStudent; i++) {
		// nextToken 으로 하나의 토큰을 정수형으로 바꾼 데이터를 배열의 요소에 저장
		   scores[i] = Integer.parseInt(tok.nextToken());	
		}
		for (int t = 0; t < scores.length; t++) {
			sum += scores[t];
		}
		int average =  sum / scores.length;
		System.out.println("합계 : " + sum + "(" + scores.length + "명)");
        System.out.println("평균 : " + average);
		

	}

}
