package chapter08.ReplaceDataValuewithObject;

public class Test2 {
	
	private Test2Data data = new Test2Data(1,"bill","xxx.x.x.x.x.x.xxx");
	
}

  class Test2Data {
	public int age;
	public String name;
	public String adress;
	public Test2Data(int age, String name, String adress) {
		super();
		this.age = age;
		this.name = name;
		this.adress = adress;
	}
	
}
