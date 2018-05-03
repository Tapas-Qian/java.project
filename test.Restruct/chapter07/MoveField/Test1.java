package chapter07.MoveField;

class Dog{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Person{
	
	public void method1(){
		Dog dog=new Dog();
		dog.setAge(10);
		System.out.println(dog.getAge()+1+2);
	}
	public void method2(){
		Dog dog=new Dog();
		dog.setAge(10);
		System.out.println(dog.getAge()+3+4);
	}
	public void method3(){
		Dog dog=new Dog();
		dog.setAge(10);
	}
}
public class Test1 {

}
