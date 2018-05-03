package chapter10.ReplaceParameterwithMethods;

public class Test {
	public static void main(String[] args) {
		Test test=new Test();
		test.method(test.getStr());
	}
	
	public void method(String str){
		System.out.println(str);
	}
	
	public String getStr(){
		return "HelloWorld";
	}
}
