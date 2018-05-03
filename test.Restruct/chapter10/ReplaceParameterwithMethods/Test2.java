package chapter10.ReplaceParameterwithMethods;

public class Test2 {
	public static void main(String[] args) {
		Test2 test=new Test2();
		test.method();
	}
	
	public void method(){
		System.out.println(this.getStr());
	}
	
	public String getStr(){
		return "HelloWorld";
	}
}
