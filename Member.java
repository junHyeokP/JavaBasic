package chap04;

public class Member {
	private String name;
	private String id;
	private String pwd;
	private String age;
	
	Member(String name, String id, String pwd, String age) {
		setName(name);
		setId(id);
		setPwd(pwd);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
