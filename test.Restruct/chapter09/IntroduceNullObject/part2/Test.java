package chapter09.IntroduceNullObject.part2;

/**
 * 有了NullAnimal对象之后，然后采用多态性的时候，在程序将一个null或者非null对象传给
 * 一个父类性对象之后，都是一样的使用方式，null对象通过重写方法已经处理了可能的情况
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(1, "bill");
		System.out.println(animal);
		
		animal=new NullAnimal(0,null);
		System.out.println(animal);
	}
}
