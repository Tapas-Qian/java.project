package chapter06.ReplaceMethodwithMethodObject;

public class Test1 {
	public void method(){
		int a=1,b=2,c=3,d=4;
		
		int e=a+b+c+d;
		System.out.println("HelloWorld1");
		System.out.println("HelloWorld2");
		System.out.println("HelloWorld3");
		System.out.println("HelloWorld4");
		
		int f=e+a;
		System.out.println("HelloWorld1");
		System.out.println("HelloWorld4");
		
		int g=e+a+b-c;
		System.out.println("HelloWorld1");
		System.out.println("HelloWorld2");
		System.out.println("HelloWorld3");
		System.out.println("HelloWorld4");
		System.out.println("HelloWorld1");
		System.out.println("HelloWorld3");
		System.out.println("HelloWorld4");
	}
}
