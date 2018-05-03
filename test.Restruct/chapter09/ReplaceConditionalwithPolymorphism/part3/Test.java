package chapter09.ReplaceConditionalwithPolymorphism.part3;

/**
 * 假如有继承体系,那么可以有多态性,
 * 然后如果有工厂方法,就可以通过字符串来动态的实例化字符串制定的对象,
 * 如果采用Class类,即采用反射机制,真正的可以没有switch...case..也没有if..else..就是直接实例化
 * 
 * 而如果没有上面的,也就是连最基本的继承体系都没有的话,那么
 * 最基本的方式就是采用switch...case..或者if...else..根据某一个条件,来执行某一段代码
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(1, "bill");
		System.out.println(animal.toString());
		
		animal=new Dog(2, "jack");
		System.out.println(animal.toString());
	}
}
