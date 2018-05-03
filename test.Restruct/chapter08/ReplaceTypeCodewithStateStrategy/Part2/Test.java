package chapter08.ReplaceTypeCodewithStateStrategy.Part2;

/**
 * 这个和继承子类化还是有一点区别，子类化是实例化自己，然后调用自己的方法
 * 而这个策略模式，是new一个对象传入封装对象，然后通过调用封装对象的方法，调用了传入对象的方法
 * 
 * 可以这么想，封装对象是根据传入的不同对象是可变的，也就说开始是工程师，可以升级为经理，
 * 而继承子类化就不具备这样的能力
 */
public class Test {
	public static void main(String[] args) {
		Context context1=new Context(new ConcreteStrategy1());
		context1.doAnything();
		
		Context context2=new Context(new ConcreteStrategy2());
		context2.doAnything();
	}
}
