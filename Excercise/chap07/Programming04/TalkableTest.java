package chap07Programming02;

public class TalkableTest {
	
	static void speak(Talkable language) {
		language.talk();
	}

	public static void main(String[] args) {
	
	speak(new Korean());
	speak(new American());

	}

}
