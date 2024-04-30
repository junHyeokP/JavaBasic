package chap2;

public class InstanceofDemo {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		//변수가 해당 타입이나 자식 타입이면 TRUE, 아님 FALSE를 반환하여 확인하는 연산자
		System.out.println(s instanceof Person);
		
		System.out.println(s instanceof Student);

		System.out.println(p instanceof Student);

		// System.out.println(s instanceof String);

		downcast(s);
	}

	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}
}
