package generic;

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		System.out.println("자동차를 rent했습니다.");
		return new Car();
		}
}