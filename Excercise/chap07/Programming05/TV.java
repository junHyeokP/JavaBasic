package chap07Programming02;

public class TV extends Controller{
	
	String name;
	
	TV(boolean power) {
		this.power = power;
	}
	
	void show() {
		if (power) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}

	@Override
	String getName() {
		return this.name;
	}

}
