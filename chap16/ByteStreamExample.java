package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample { // 바이트 스트림, 1바이트 단위의 입출력을 처리하는 예제.

	public static void main(String[] args) throws IOException { 
		String orgFilename = "Curi_01.jpg"; //이미지 파일 원본 이름 
		String copiedFilename = "Curi_01_copied.jpg"; // 카피될 이미지 파일 이름 
		try { // 다음의 명령어 시도
			// 밑에 있는 두개의 객체들은 시스템에 있는 모든 파일을 읽거나 쓸 수 있는 기능을 제공하는 객체들임, 생성자로 스트림 객체를 생성할 때 특정 예외가 발생할 가능성이 있기에 try catch문으로 명령어 실행
			FileInputStream  fis = new FileInputStream(orgFilename); // 입력 스트림 인스턴스 객체 fis를 생성하여 읽을 파일을 매개로 한 주소 생성 
			FileOutputStream fos = new FileOutputStream(copiedFilename); //출력 스트림 인스턴스 객체 fos를 생성하여 출력할 다른 파일 생성 
			copyEachOneByte(fis, fos);  // 바이트를 하나씩 복사하여 전달받는 메서드 호출
			//copyEachKByte(fis, fos); // 길이 1024짜리 바이트 배열에다가 바이트 데이터를 저장하는 메서드
			fos.flush(); // 출력 스트림 내보내기
			fos.close(); // 출력 스트림 닫기
			fis.close(); // 입력 스트림 닫기
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) { // 명령어 실행 중 예외 처리 오류 발생시 변수 e에서 특정 메서드를 호출 
			System.out.println(e.getMessage()); // e.예외 처리 오류 메세지 호출
		}	
	} 

	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException { // 예외 처리 오류 던지기(떠넘기기), 특정 오류를 명시적으로 발생시켜서 무시해버림,던져버린 예외 처리 오류는 그대로 상위 코드가 처리하도록 떠넘겨버림 
		int byteInput; //바이트를 받는 변수 생성 
		while ((byteInput = fis.read()) != -1) { // 인스턴스 객체 fis에서 read 메서드 호출,read()는 int 타입을 반환하며, ASCII코드 값으로 표현한다고 함, 더이상 읽을 데이터가 없으면 -1 반환, 파일에서 불러들일 데이터가 없을 때까지 바이트 전달
			fos.write(byteInput); // 인스턴스 객체 fos에서 호출하는 출력 메서드, write()는 대부분의 운영체제나 JVM에서 표준 출력 장치를 효율적으로 관리하기 위해 버퍼를 사용한다고함. (버퍼를 비우기 위하여 flush 메서드 호출 필요)
		}
	}
	
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024];
		while (fis.read(kbInput) != -1) {
			fos.write(kbInput);
		}
	}

}
