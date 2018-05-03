package chapter08.SelfEncapsulateField;

public class Test2 {
	public static void main(String[] args) {
		Sun sun=new Sun();
		sun.setA(1);
		System.out.println(sun.getA());
	}
}

class Father{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class Sun extends Father{
	public int getA() {
		return super.getA()+super.getA()+super.getA()+super.getA()+super.getA();
	}
}
