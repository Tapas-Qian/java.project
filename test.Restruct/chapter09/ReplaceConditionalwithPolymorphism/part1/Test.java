package chapter09.ReplaceConditionalwithPolymorphism.part1;

/**
 * switch/if最基本的一次使用，程序语言的基本使用，没什么问题
 * switch/if如下的在多个函数中多次根据一个条件的使用，缺点很大
 * 改进1：将每个case块中的写成继承体系，然后通过一次switch/if达到多次减成一次的效果
 * 改进2：在上面的继承体系基础上，写成反射机制+工厂方法，消灭switch/if
 */
public class Test {
	public static void main(String[] args) {
		String str="Dog";
		method1(str);
		method2(str);
	}

	private static void method1(String str) {
		switch (str) {
		case "Dog":
			System.out.println("I am dog"); //这里可能是一些跟狗类相关的一些代码
			break;
		case "Cat":
			System.out.println("I am cat");
			break;
		default:
			System.out.println("no!!!!");;
		}
	}
	
	private static void method2(String str){
		switch (str) {
		case "Dog":
			System.out.println("汪汪汪"); 
			break;
		case "Cat":
			System.out.println("喵喵喵");
			break;
		default:
			System.out.println("^(&3#$%%#$");
		}
	}
}
