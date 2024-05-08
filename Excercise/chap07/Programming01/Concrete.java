package chap07Programming02;

public class Concrete extends Abstract{
  int j;
  
  Concrete(int j, int i) {
	  super(i);
	  this.j = j;
  }
  
  void show() {
	  System.out.println("i = " + i + " j = " + j);
  }
}
