package chapter08.ChangeValuetoReference.Part1;

/**
 * ����˵���ǣ��ðɣ����ַ�ʽ��ʵ����order��Customer������Ҳ�����õģ��������������new��
 * ��ʽ����Customer����Ļ���ô�Ͳ������õ�ͬһ����
 * 
 * ������hashTable�ķ�ʽ����ȷ�����϶�order���õ���ͬһ������
 */
public class Test {
	public static void main(String[] args) {
		Customer customer1=new Customer("bill");
		Customer customer2=new Customer("jack");
		
		/**
		 * ͬһ���ͻ�������������Ӧ������������
		 */
//		Order order1=new Order(customer1);
//		Order order2=new Order(customer1);
		
		Order order1=new Order(new Customer("bill"));
		Order order2=new Order(new Customer("bill"));
		
		System.out.println(order1.getCustomer()==order2.getCustomer());
	}
}
