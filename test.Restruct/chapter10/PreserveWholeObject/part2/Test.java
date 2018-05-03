package chapter10.PreserveWholeObject.part2;

public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(10, "bill");
		Test test=new Test();
		test.method(animal);
	}
	
	public void method(Animal animal){
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
	}
}
