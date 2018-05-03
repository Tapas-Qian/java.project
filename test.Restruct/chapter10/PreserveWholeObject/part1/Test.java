package chapter10.PreserveWholeObject.part1;

public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(10, "bill");
		Test test=new Test();
		test.method(animal.getAge(),animal.getName());
	}
	
	public void method(int a,String name){
		System.out.println(a);
		System.out.println(name);
	}
}
