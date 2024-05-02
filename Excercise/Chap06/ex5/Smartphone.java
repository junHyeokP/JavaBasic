package Chap06;

public class Smartphone extends Telephone{
	private String game;
	
	Smartphone(String owner, String game) {
		super(owner, game);
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}
}
