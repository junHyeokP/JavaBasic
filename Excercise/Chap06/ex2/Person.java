package Chap06;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println("사람[이름 : " + name + ", " + "나이 : " + age + "]");
	}
}
