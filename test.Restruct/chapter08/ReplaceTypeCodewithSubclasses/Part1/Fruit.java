package chapter08.ReplaceTypeCodewithSubclasses.Part1;

public class Fruit {
	private final int apple=1;
	private final int orange=2;
	private int typeCode;
	
	public Fruit(int typeCode) {
		super();
		this.typeCode = typeCode;
	}

	public void method(){
		if(typeCode==apple){
			appleMethod();
		}
		else if(typeCode==orange){
			orangeMethod();
		}
		else{
			System.out.println("not have this fruit");
		}
	}
	
	public void appleMethod(){
		System.out.println("I am an apple");
	}
	
	public void orangeMethod(){
		System.out.println("I am an orange");
	}
}
