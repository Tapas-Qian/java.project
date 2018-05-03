package chapter10.SeparateQueryfromModieier;

public class Test2 {
	public static void main(String[] args) {
		Test2 test1=new Test2();
		int a=test1.get();
		System.out.println(a);
		test1.print();
	}
	
	public int get(){
		return 2;
	}
	public void print(){
		System.out.println("HelloWorld");
	}
}
