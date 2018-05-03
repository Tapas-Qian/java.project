package chapter07.MoveField;

class Dogg{
	
}

class Personn{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void method1(){
		this.age=20;
		System.out.println(this.getAge()+1+2);
	}
	public void method2(){
		Dogg dog=new Dogg();
		this.age=10;
		System.out.println(this.getAge()+3+4);
	}
	public void method3(){
		Dogg dog=new Dogg();
		this.age=10;
	}
}
public class Test2 {
	
}
