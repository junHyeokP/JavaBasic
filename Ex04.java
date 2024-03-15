package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int sec = sc.nextInt();
		int hour = sec/3600;
		int min = 0;
		int sec2 = 0;
		if (hour == 0) {
			min = sec/60;
		}
		else {min = hour/60;}
		sec2 = sec % 3600 % 60 ;		
		
		System.out.println(hour + "시간 "+ min + "분 " + sec2 + "초");
		
	}

}
