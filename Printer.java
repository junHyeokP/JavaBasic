package chap04;

public class Printer {
		
	private int numOfPapers;
	private boolean duplex;
	
	Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if (getDuplex()) {
			amount = amount % 2 == 0 ? amount / 2 : (amount / 2) + 1;
		}
		//용지 없음
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		}
		
		//용지 충분
		else if (getDuplex() && numOfPapers >= amount) {
			this.numOfPapers -= amount;
			System.out.println("양면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
		}
		else if (numOfPapers >= amount) { 	
		this.numOfPapers -= amount;
		System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
		}
	
		//용지 부족
		
		else {
		System.out.println("단편으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "장 부족합니다." + numOfPapers + "장만 출력합니다.");
			this.numOfPapers = 0;
		}
		
	}
	public boolean getDuplex() {
		return this.duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}


