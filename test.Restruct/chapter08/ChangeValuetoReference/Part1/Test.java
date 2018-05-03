package chapter08.ChangeValuetoReference.Part1;

/**
 * 我想说的是，好吧，这种方式，实际上order用Customer对象构造也是引用的，不过由于如果以new的
 * 方式构造Customer对象的话那么就不是引用的同一个了
 * 
 * 而采用hashTable的方式则能确保，肯定order引用的是同一个对象
 */
public class Test {
	public static void main(String[] args) {
		Customer customer1=new Customer("bill");
		Customer customer2=new Customer("jack");
		
		/**
		 * 同一个客户的两个订单对应的是两个对象
		 */
//		Order order1=new Order(customer1);
//		Order order2=new Order(customer1);
		
		Order order1=new Order(new Customer("bill"));
		Order order2=new Order(new Customer("bill"));
		
		System.out.println(order1.getCustomer()==order2.getCustomer());
	}
}
