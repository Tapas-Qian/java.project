package chapter06.ExtractMethod;

public class Test2 {
	public void method(){
		int a=1,b=2,c;
		c=a+b;
		
		printHelloWorld();
	}

	private void printHelloWorld() {
		//print HelloWorld
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
	}
}
