package Loop;

import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		// 입력된 숫자에 맞춰서 다음과 같이 *를 찍기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 
		    //Star01
		    for(int star01 = 1; star01 <= num; star01++) {
		    for(int s1 = 0; s1 < star01; s1++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		    }
		    System.out.print("\n");
		   
		    //Star02
		   for(int star02 = 0; star02 < num; star02++) {
			  for(int s2 = num; s2 > star02; s2--) {
				  System.out.print("*");
			  }
			  for(int s2 = 0; s2 <= star02; s2++) {
				  System.out.print(" ");
			  }
			  System.out.println();
		   }
		   System.out.print("\n");
		   //Star03
		   for(int star03 = 1; star03 < num+1; star03++) {
			   for(int s3 = num; s3 > star03; s3--) {
				   System.out.print(" ");
			   }
			   for(int s3 = 0; s3 < star03; s3++) {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   System.out.print("\n");
		    
		   //Star04
		    for(int star04 = 0; star04 < num; star04++) {
			   for(int s4 = 0; s4 < star04; s4++) {
				   System.out.print(" "); //왼쪽부터 늘어나는 공백 구현	   
			   }
		   for(int s4 = num; s4 > star04; s4--) {
			   System.out.print("*");
		   }
		    System.out.println();
		   }
		    System.out.print("\n");
		    //star05
		   for(int star05 = 1; star05 < num+num; star05 += 2) {
			   for(int s5 = num+num-1; s5 > star05; s5 -=2) {
				   System.out.print(" ");
			   }
			   for(int s5 = 0; s5 < star05; s5++) {
				   System.out.print("*");
			   }
			   System.out.println();
		    }
		    	

	}

}
