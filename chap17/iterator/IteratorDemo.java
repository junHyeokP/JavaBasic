package iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
        Collection<String> list = Arrays.asList("다람쥐", "개구리","나비"); // list에 문자열 객체 넣기

		      Iterator<String> iterator = list.iterator(); 
		      while (iterator.hasNext()) // 다음 객체가 존재할동안
		      System.out.print(iterator.next() + "-"); // 리스트에 담긴 객체를 출력 (cursor 포인터로 객체를 가리켜줌)
		      
		      System.out.println();

		        while (iterator.hasNext()) // 이미 위에서 다 불러왔으므로 남은 객체가 존재하지 않음 (cursor가 최대 인덱스에 도달)
		        System.out.print(iterator.next() + "+");
		        
		        System.out.println(); 
		        
		       

		        	iterator = list.iterator(); // list에 담겨있던 객체들을 다시 iterator 변수에 넣어둠 (cursor 값 초기화)
		        	while (iterator.hasNext())
		        		
		            System.out.print(iterator.next() + "=");
		    
		}
	}

