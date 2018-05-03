package chapter08.DuplicateObservedData.Part2;

/**
 * 介个示例参考自java开发实战经典
 * 
 * 	执行了
 * 	super.setChanged();
 *  super.notifyObservers(price);
 *  之后，系统自动执行了所有实现Observer接口的update方法
 *  
 *  
 *  实例化继承自Observable的类是自然而然的
 *  实例化实现接口Observer接口的类，以及将一系列观察者add到可观察对象的列表里面这些都需要
 *  在客户代码里面写出来，
 *  
 *  然后可观察对象随便捣腾，观察者里面的数据总是同步发生变化的
 *  
 *  也就说这个add过程，即建立依赖的过程总是必须变现出来的，不然都有那些观察者都不知道
 *  缺点是：多出来了这一部分的代码
 *  优点是：由于同一个数据，多个对象都需要使用，而且需要让他们同步，那么这样的情况下就是值得的，
 *  比如在GUI编程中，程序逻辑代码需要使用某个数据，而多个界面也需要表现那个数据，那么，就让所有
 *  界面都称为观察者，观察逻辑代码里面数据的变化，逻辑代码随便变动，只要使用了这个模式，总能
 *  保证数据的同步
 */
public class Test {
	public static void main(String[] args) {
		House house=new House(10000);
		
		HousePriceObserver housePriceObserver1=new HousePriceObserver("bill");
		HousePriceObserver housePriceObserver2=new HousePriceObserver("jack");
		HousePriceObserver housePriceObserver3=new HousePriceObserver("lucy");
		
		house.addObserver(housePriceObserver1);
		house.addObserver(housePriceObserver2);
		house.addObserver(housePriceObserver3);
		
		System.out.println(house);
		
		System.out.println("调用setPrice方法");
		house.setPrice(20000);
		System.out.println("setPrice方法结束");
		
		System.out.println(house);
		
		System.out.println(housePriceObserver1.getObserveredPrice());
		System.out.println(housePriceObserver2.getObserveredPrice());
		System.out.println(housePriceObserver3.getObserveredPrice());
	}
}
