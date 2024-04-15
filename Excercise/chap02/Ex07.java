package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int x = sc.nextInt();
     	int four = x % 4;
     	int five = x % 5;
        int all = x % 4 % 5;
        //4와 5로 나누어지는지 
       System.out.println(all == 0);
        // 4 또는 5로 나누어 지는지
        if (four == 0) { 
        	System.out.println(four == 0);
        }
        else System.out.println(five == 0);
        // 4나 5중 하나로 나누어 지지만 두 수 모두로는 나누어지지 않는지
        if (all == 0) {
        	System.out.println(all == 0);
        }
        else if (four == 0) {
        	System.out.println(four);
        } 
        else {
        	System.out.println(five == 0);
        }
 	}
}
