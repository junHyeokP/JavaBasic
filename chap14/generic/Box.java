package generic;

public class Box<T> {
	//제네릭 "타입" (T = Type)
		private T content;
		public T getContent() {
			return content;
		}
		
		public void setContent(T content) {
			this.content = content;
		}

}
