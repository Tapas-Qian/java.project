package chapter10.ReplaceParameterwithExplicitMethod;

public class Test2 {
	private double height;
	private double width;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.setHeight(10);
		test2.setWidth(20);
	}
}
