package chapter08.SelfEncapsulateField;

public class Test1 {
	public void method(){
		Test test2=new Test();
		System.out.println(test2.a);
	}
}

class Test{
	public int a;
}
