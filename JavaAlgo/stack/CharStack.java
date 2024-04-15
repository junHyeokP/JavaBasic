package stack;

public class CharStack {

	private char[] stack;
	private int top;
	private int capacity;
	
	public CharStack(int capacity) {
		//메인에서 객체로 선언되어 같이 온 매개 변수를 클래스 필드에 있는 변수에 넣기
		this.capacity = capacity;
		this.stack = new char[capacity];
	}
	
	public boolean isEmpty() {
		//top이 비어있다는걸 표현하는 역할
	return top == 0;
	}
	
	public boolean isFull() {
		//top이 최대치랑 같은지 비교하는 역할
		return top == capacity;
	}
	
	public boolean push(char par) {
	if (isFull()) return false;
	stack[top++] = par;
	return true;
	
	}
	
	public char pop() {
	if (isEmpty()) return '0';
	return stack[--top];
	}
	
	public char getTop() {
		if(isEmpty()) return 0;
		return stack[top - 1];
	}
	
	
}