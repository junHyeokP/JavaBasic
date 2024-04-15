package chap04;

public class Triangle {
	
	private double width;
	private double height;
	
	Triangle(double widthd, double heightd) {
		setWidth(widthd);
		setHeight(heightd);
		}
		public double findArea() {
		return getWidth() * getHeight() / 2;
		}
	
		public boolean isSameArea(Triangle t) {
			if (findArea() == t.findArea()) 
			return true;
			
			return false;
		}

		public double getWidth() {
		return width;
		}

		public void setWidth(double width) {
		this.width = width;
		}

		public double getHeight() {
		return height;
		}

		public void setHeight(double height) {
		this.height = height;
		}
}
