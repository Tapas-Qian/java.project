package chapter08.ReplaceTypeCodewithStateStrategy.Part2;

/**
 * ����ͼ̳����໯������һ���������໯��ʵ�����Լ���Ȼ������Լ��ķ���
 * ���������ģʽ����newһ���������װ����Ȼ��ͨ�����÷�װ����ķ����������˴������ķ���
 * 
 * ������ô�룬��װ�����Ǹ��ݴ���Ĳ�ͬ�����ǿɱ�ģ�Ҳ��˵��ʼ�ǹ���ʦ����������Ϊ����
 * ���̳����໯�Ͳ��߱�����������
 */
public class Test {
	public static void main(String[] args) {
		Context context1=new Context(new ConcreteStrategy1());
		context1.doAnything();
		
		Context context2=new Context(new ConcreteStrategy2());
		context2.doAnything();
	}
}
