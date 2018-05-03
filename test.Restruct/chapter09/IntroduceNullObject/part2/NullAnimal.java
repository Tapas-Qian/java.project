package chapter09.IntroduceNullObject.part2;

public class NullAnimal extends Animal {

	public NullAnimal(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	
	public int getAge() {
		return 0;
	}
	public String getName() {
		return null;
	}
	@Override
	public String toString() {
		return "Animal [age=0 name=null]";
	}
}
