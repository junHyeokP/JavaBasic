package Chap06;

public class Telephone extends Phone{

	private String when;
	
	Telephone(String owner, String when) {
		//부모 객체 필드 변수 호출하기
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래");
	}
}
