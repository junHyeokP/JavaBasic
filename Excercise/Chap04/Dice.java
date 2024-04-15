package chap04;

import java.util.Random;

public class Dice {
	private final int face = 6;
	
	public double roll() {
		Random r = new Random();
		double rd = Math.random();
		return rd;
	}
}
