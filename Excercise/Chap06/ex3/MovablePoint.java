package Chap06;

public class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(xSpeed, ySpeed);
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	//MovablePoint가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드만들기
	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

}
