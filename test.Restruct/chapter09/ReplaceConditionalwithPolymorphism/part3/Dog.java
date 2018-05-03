package chapter09.ReplaceConditionalwithPolymorphism.part3;

public class Dog extends Animal {

	public Dog(int age, String name) {
		super(age, name);
	}
	@Override
	public String toString() {
		return "Dog [age=" + this.getAge() + ", name=" + this.getName() + "]";
	}
}
