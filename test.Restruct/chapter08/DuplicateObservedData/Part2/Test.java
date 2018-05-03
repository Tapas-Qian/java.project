package chapter08.DuplicateObservedData.Part2;

/**
 * ���ʾ���ο���java����ʵս����
 * 
 * 	ִ����
 * 	super.setChanged();
 *  super.notifyObservers(price);
 *  ֮��ϵͳ�Զ�ִ��������ʵ��Observer�ӿڵ�update����
 *  
 *  
 *  ʵ�����̳���Observable��������Ȼ��Ȼ��
 *  ʵ����ʵ�ֽӿ�Observer�ӿڵ��࣬�Լ���һϵ�й۲���add���ɹ۲������б�������Щ����Ҫ
 *  �ڿͻ���������д������
 *  
 *  Ȼ��ɹ۲������㵷�ڣ��۲����������������ͬ�������仯��
 *  
 *  Ҳ��˵���add���̣������������Ĺ������Ǳ�����ֳ����ģ���Ȼ������Щ�۲��߶���֪��
 *  ȱ���ǣ����������һ���ֵĴ���
 *  �ŵ��ǣ�����ͬһ�����ݣ����������Ҫʹ�ã�������Ҫ������ͬ������ô����������¾���ֵ�õģ�
 *  ������GUI����У������߼�������Ҫʹ��ĳ�����ݣ����������Ҳ��Ҫ�����Ǹ����ݣ���ô����������
 *  ���涼��Ϊ�۲��ߣ��۲��߼������������ݵı仯���߼��������䶯��ֻҪʹ�������ģʽ������
 *  ��֤���ݵ�ͬ��
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
		
		System.out.println("����setPrice����");
		house.setPrice(20000);
		System.out.println("setPrice��������");
		
		System.out.println(house);
		
		System.out.println(housePriceObserver1.getObserveredPrice());
		System.out.println(housePriceObserver2.getObserveredPrice());
		System.out.println(housePriceObserver3.getObserveredPrice());
	}
}
