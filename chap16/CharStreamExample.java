package stream;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample { //문자 스트림, 2바이트 단위의 문자 입출력을 처리하는 예제

	public static void main(String[] args) throws IOException {
		String orgFilename = "D1_Student.txt"; // 오리지널 파일
		String copiedFilename = "D1_Student_copied.txt"; //카피된 파일
		
		try { // 다음 명령문들을 실행
			FileReader fr = new FileReader(orgFilename); //오리지널 파일을 매개변수로 하는 파일 입력자를 주소로 지정하는 인스턴스 객체 fr를 생성
			FileWriter fw = new FileWriter(copiedFilename); //카피된 파일을 매개변수로 함, 파일 출력자를 주소로 지정하는 인스턴스 객체 fw를 생성
			copyCharData(fr, fw); //문자 데이터 카피를 위해 만든 메소드 호출 (fr, fw를 매개로)
			//copyCharArrData(fr, fw); , 최대 길이가 100인 배열에 변수에 넣을 파일의 값이 -1이 아닐동안 출력하는 메서드
			fw.flush(); //파일 출력자에 담겼던 출력 스트림 기록 내보내기, flush는 보통 중요한 데이터를 즉시 저장해야 할 때나 버퍼에 남아 있는 데이터가 있을 때, 실시간으로 데이터를 처리해야 할 때에 쓰인다 함
			fw.close(); //파일 출력자 닫기
			fr.close(); //파일 입력자 닫기
			System.out.println(orgFilename + " 복사가 완료되었습니다."); // 파일 복사 완료 메세지 출력
		} catch (FileNotFoundException e) { // 예외 잡기,특정 예외 처리 오류 발생시 항상 'e' 객체를 사용함 (e는 변수명에 불과하므로 다른것으로 써도 되지만, 이건 개발자들끼리 정해둔 예외 객체를 참조하는데 통용되는 변수 이름이라고 함.)
			System.out.println(e.getMessage()); // e 객체에서 별도의 설명 메세지를 출력하도록 처리 
		}

	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100];
		while (fr.read(charArrData) != -1) {
			System.out.print(charArrData);
			fw.write(charArrData);
		}
		
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException { // 예외 던지기,조건이 만족되지 않아서 발생한 특정 예외 (여기선 IOException)를 명시적으로 발생시켜서 예외를 던짐, 이외에도 catch 블록 내에서도 사용가능하다고 함.
		int charData; // 문자 데이터를 받을 변수 생성
		while ((charData = fr.read()) != -1) { // 파일에서 문자 데이터 받기, 파일에서 받을 데이터가 없을 때 까지
			System.out.print((char)charData); // char 타입의 문자 데이터를 출력하기
			fw.write(charData); // 버퍼링
		}
	}

}

