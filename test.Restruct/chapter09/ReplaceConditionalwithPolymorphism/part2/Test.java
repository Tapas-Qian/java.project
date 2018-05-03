package chapter09.ReplaceConditionalwithPolymorphism.part2;

public class Test {
	public static void main(String[] args) {
		Animal animal =Factory.getInstance("chapter09.ReplaceConditionalwithPolymorphism.part2.Dog");
		animal.method1();
		animal.method2();
	}
}
