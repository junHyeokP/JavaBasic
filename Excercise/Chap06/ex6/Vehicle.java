package Chap06;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("색깔 : " + color + " 속도 : " + speed);
	}
	

}
