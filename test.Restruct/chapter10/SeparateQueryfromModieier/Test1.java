package chapter10.SeparateQueryfromModieier;

public class Test1 {
	public static void main(String[] args) {
		Test1 test1=new Test1();
		int a=test1.getAndPrint();
		System.out.println(a);
	}
	
	public int getAndPrint(){
		System.out.println("HelloWorld");
		return 2;
	}
}
