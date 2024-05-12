package generic;

public class Box<T> {
	//제네릭 "타입" (T = Type), 예제에서 <Integer>타입을 넣었으므로 타입은 Integer가 됨
		private T content;
		
		public T getContent() {
			return content;
		}
		
		public void setContent(T content) {
			this.content = content;
		}

}
