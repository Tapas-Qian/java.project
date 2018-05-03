package chapter10.ReplaceParameterwithExplicitMethod;

public class Test1 {
	private double height;
	private double width;
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.set("Height", 10);
		test1.set("Width", 20);
	}
	
	public void set(String name,double data){
		if(name.equals("Height")){
			height=data;
		}
		if(name.equals("Width")){
			width=data;
		}
	}
}
