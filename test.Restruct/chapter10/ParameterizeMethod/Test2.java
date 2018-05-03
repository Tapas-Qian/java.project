package chapter10.ParameterizeMethod;

public class Test2 {
	public static void main(String[] args) {
		Test2 test1 = new Test2();
		test1.method(1, 2);
		test1.method(10, 20);
	}

	public void method(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

}
