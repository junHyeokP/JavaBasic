package Method;


import java.util.Scanner;

public class Max01 {

	public static int Tri (int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
	public static void main(String[] args) {
           
		 Scanner sc = new Scanner(System.in);
		    int t;
		    int s;
            do {
            System.out.print("세 개의 숫자를 입력하세요 : ");
 	        int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			t = Tri(a, b, c);
		    System.out.println("최대값은 " + t + "입니다.");
            } while (t != 0);
            System.out.println("종료합니다.");
		    	
		    
   
	}

}
