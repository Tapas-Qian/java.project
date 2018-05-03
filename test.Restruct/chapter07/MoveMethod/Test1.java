package chapter07.MoveMethod;

class Dog {
	public void Bark() {

	}
}

class Person {
	public void Walk() {
		Dog dog=new Dog();
		dog.Bark();
		
		System.out.println("Walk");
	}

	public void Say() {
		Dog dog=new Dog();
		dog.Bark();
		
		System.out.println("Say");
	}

	public void Sing() {
		Dog dog=new Dog();
		dog.Bark();
		
		System.out.println("Sing");
	}
}

public class Test1 {

}
