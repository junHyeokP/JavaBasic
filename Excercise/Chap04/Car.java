package chap04;

public class Car {
	
	private String color;
	private static int num = 0;
	private static int rednum = 0;
	
	Car(String color) {
		this.color = color;
		this.num++;
		if (color.equals("RED"))
			this.rednum++;
	}
	
	public static int getNumOfCar() {
		return num;
	}
	public static int getNumOfRedCar() {
		return rednum;
	}
}
