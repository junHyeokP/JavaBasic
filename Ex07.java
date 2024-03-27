package chap03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		String c = input("철수 : ");
		String y = input("영희 : ");
        whosWin(c, y);
        
	}
	static String input(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		return sc.next();	
}
	static void whosWin (String c, String y) {
			if (c.equals(y)) {
			 System.out.println("무승부입니다.");  
		 	} else if (c.equals("r")) {
		 		 if (y.equals("p")) {
		 			System.out.println("영희 승");
		 		 }
		 		 if(y.equals("s")) {
		 			System.out.println("철수 승");
		 		 }
		 	}
		 	else if (c.equals("p")) {
		 	 		if (y.equals("s")) {
		 		 			System.out.println("영희 승");
		 		 		}
		 		 		if(y.equals("r")) {
		 		 			System.out.println("철수 승");
				 	    }	
		 	}
		 	else if (c.equals("s")) {
		 		 if (y.equals("r")) {
			 			System.out.println("영희 승");
			 		 }
			 		 if(y.equals("p")) {
			 			System.out.println("철수 승");
			 		 }
		 	}
 }
}
