package Array;

public class Continue01 {
	
	public static void gugu() {
		for (int g = 2; g <= 9; g++) {
			if (g == 4) {
				continue;
			}
			if (g == 7) {
				continue;
			}
			for (int u = 1; u <= 9; u++) {
				System.out.println(g + " x " + u +" = " + (g*u));
			}
		}
	}

	public static void main(String[] args) {
		gugu();
		
	}

}
