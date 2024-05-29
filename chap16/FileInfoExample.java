package stream;

import java.io.File;
import java.io.IOException;

public class FileInfoExample { // 파일 정보 출력 예제

	public static void main(String[] args) throws IOException { // 문자열을 출력하므로 IOException을 던질 필요가 있음

		File imgDir = new File("C:/Temp/images"); // 파일 경로를 참조하는 객체 생성
		File testFile = new File("C:/Temp/test.txt"); // 텍스트 파일을 경로로하는 인스턴스 객체 생성
		
		if(imgDir.exists() == false) {  // 경로에 폴더가 없다면
			imgDir.mkdirs(); // 객체 imgDir에서 cmd에서 입력하는 명령어와 거의 동일한 기능의 메서드 호출,미리 지정했던 경로에 폴더 생성
			System.out.println(imgDir.getName() + "을 생성합니다."); // imgDir의 이름을 가져오며 출력
		}
		if(testFile.exists() == false) { // 경로에 텍스트 파일이 없다면
			testFile.createNewFile(); // 새 파일 생성을 해주는 메서드 호출
			System.out.println(testFile.getName() + "을 생성합니다."); // 텍스트 파일의 이름을 가져오며 출력
		}

		File tempDir = new File("C:/Temp"); // 임시 디렉토리 생성을 위한 객체 생성
		File[] contents = tempDir.listFiles(); // 파일 리스트들을 배열에 저장
		System.out.println(tempDir.getName() + "의 내용을 출력합니다."); // 객체 이름을 출력
		for(File file : contents) { // 파일에서 가져온 콘텐츠의 이름과 유형을 나타내는 for문 
			System.out.print("\t" + file.getName()); // file 객체의 이름 출력
			if (file.isDirectory()) { // 파일이 아닌 폴더일경우
				System.out.print("<DIR>"); // <DIR> 명시
			}
			else {
				System.out.print("<"+file.length() + ">"); // 파일의 길이 출력
			}
			System.out.println(); // 줄 바꿈, 개행 역할
		}

	}

}
