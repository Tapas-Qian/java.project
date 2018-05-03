package chapter09.ReplaceConditionalwithPolymorphism.part3;

public class Cat extends Animal {

	public Cat(int age, String name) {
		super(age, name);
	}
	@Override
	public String toString() {
		return "Dog [age=" + this.getAge() + ", name=" + this.getName() + "]";
	}
}
