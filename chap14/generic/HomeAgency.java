package generic;

public class HomeAgency implements Rentable <Home> { //제네릭 타입 home
	@Override
	public Home rent() {
		System.out.println("집을 rent했습니다.");
		return new Home();
	}	
}