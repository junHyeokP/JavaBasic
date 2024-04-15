package Loop;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
	    int num = sc.nextInt();
	    
	    int sum = 0;
	    
	    for (int i = 1; i <= num; i++) {
	    	sum += i;
	    }
	    
	    System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	 

	}

}
