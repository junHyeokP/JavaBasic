package chap03;

public class Ex08 {

	public static void main(String[] args) {
	    System.out.println(factorial(5));

	}
  static int factorial(int n) {
      switch (n) {
      case 5 : n *= 4;
	  case 4 : n *= 3;
	  case 3 : n *= 2;
	  case 2 : n *= 1;
      }	 
	  return n;  
	  }
  
}
