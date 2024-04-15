package Method;

public class NineNine01 {

	public static void printNineNine(int num) {
		System.out.println("[ 구구단 " + num + " 단 ]");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
        
		for(int i = 2; i <= 9; i++) {
			printNineNine(i);
		}

	}

}
