package Array;

public class Example03String {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Programming\n";
		
		String s = s1.concat(s2); // 두 문자열을 결합
		System.out.println("s.length() : " + s.length() + "(" + s + ")"); //문자열 길이를 반환
		s = s.trim(); //선행 및 후행 공백을 생략한다
		System.out.println("s.length() : " + s.length() + "(" + s +")"); 
		System.out.println("s.charAt(1) : " + s.charAt(1)); //지정된 문자의 인덱스를 반환
		System.out.println("s.substring(7) : " + s.substring(7)); //주어진 시작 인덱스에 대한 부분 문자열을 반환
		System.out.println("s.substring(4,12) : " + s.substring(4,12)); // 주어진 시작 인덱스와 끝 인덱스에 대한 부분 문자열을 반환
		System.out.println("s.indexOf('P') : " + s.indexOf("P")); // 지정된 문자의 인덱스를 반환 
		System.out.println("s.toLowerCase() : " + s.toLowerCase()); // 문자열을 소문자로 반환
		System.out.println("s.toUpperCase() : " + s.toUpperCase()); // 문자열을 대문자로 반환

	}

}
