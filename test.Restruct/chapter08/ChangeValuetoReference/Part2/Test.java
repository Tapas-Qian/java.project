package chapter08.ChangeValuetoReference.Part2;

public class Test {
	public static void main(String[] args) {
		/**
		 * ͬһ���ͻ�������������Ӧ������������
		 */
		Customer.loadCustomers();
		Order order1=new Order("bill");
		Order order2=new Order("bill");
		
		System.out.println(order1.getCustomer()==order2.getCustomer());
	}
}
