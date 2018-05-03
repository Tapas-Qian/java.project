package chapter10.ParameterizeMethod;

public class Test1 {
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.method1();
		test1.method2();
	}
	
	public void method1(){
		int a=1,b=2,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void method2(){
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
}
