package generic;


public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.setContent("안녕하세요.");
		String str = box1.getContent();
		System.out.println("String Box : " + str);

		Box<Integer> box2 = new Box<>();
		box2.setContent(100);
		int value = box2.getContent();
		System.out.println("Integer Box : " + value);
		

		Product<Tv, String> tvProduct = new Product<>();
		tvProduct.setKind(new Tv());
		tvProduct.setModel("스마트Tv");
		Tv tv = tvProduct.getKind();
		String tvModel = tvProduct.getModel();
		System.out.println("Product 01 : " + tv.getClass() + "의 " + tvModel );
				
				
		Product<Car, String> carProduct = new Product<>();
		carProduct.setKind(new Car());
		carProduct.setModel("SUV자동차");
		Car car = carProduct.getKind();
		String carModel = carProduct.getModel();
		System.out.println("Product 02 : " + car.getClass() + "의 " + carModel );
		
		CarAgency carRent = new CarAgency();
		carRent.rent();
		
		HomeAgency homeRent = new HomeAgency();
		homeRent.rent();
			
	
	}
	
}

