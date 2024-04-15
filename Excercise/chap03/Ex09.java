package chap03;

public class Ex09 {

	public static void main(String[] args) {
		foo("Hi", 1);
		foo("Hello", 1, 2);
		foo("goodbye everyone");
		

	}
	static void foo(String h, int n) {
	System.out.println(h + " " + n);	
	}
	static void foo(String h, int n, int m) {
		System.out.println(h + " " + n + " " + m);
	}
    static void foo(String h) {
    	System.out.println(h);
    }
}
