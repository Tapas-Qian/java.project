package chapter10.IntroduceParameterObject;

class Animal{
	private int age;
	private int name;
	public Animal(int age, int name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
}
public class Test2 {
	public static void main(String[] args) {
		
	}
	
	public void method(Animal animal){
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
	}
}
