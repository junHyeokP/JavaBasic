package Chap06;

public class ColoredCircle extends Circle{
	//필드
	String color;
	//default 생성자가 없으면 extends 자체가 안될 수도있음
	//super 메소드로 부모 객체에 있는 radius를 호출
	
     public ColoredCircle(int radius, String color){
    	 //호출된 radius는 자식 객체 안에서 사용이 가능
    	super(radius);
		this.color = color;	
	}
       // 원래 부모 객체에 있던 메소드 기능을 새로 덮어쓰기
     	@Override
		public void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다");
	}
	

}
