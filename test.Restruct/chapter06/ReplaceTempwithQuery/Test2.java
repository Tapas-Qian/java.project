package chapter06.ReplaceTempwithQuery;

public class Test2 {
	public void method(){
		if(getC()>2){
			System.out.println("HelloWorld");
		}
	}

	private int getC() {
		int a=1,b=2,c;
		c=a+b;
		return c;
	}
}
