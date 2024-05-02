package Chap06;

public class Point {
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return this.x;
	}
	int getY() {
		return this.y;
	}

	//자바에 기본적으로 탑재된 메서드 Object에 있는 toString을 재정의하기
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
