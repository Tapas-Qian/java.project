package chapter09.ReplaceConditionalwithPolymorphism.part3;

/**
 * �����м̳���ϵ,��ô�����ж�̬��,
 * Ȼ������й�������,�Ϳ���ͨ���ַ�������̬��ʵ�����ַ����ƶ��Ķ���,
 * �������Class��,�����÷������,�����Ŀ���û��switch...case..Ҳû��if..else..����ֱ��ʵ����
 * 
 * �����û�������,Ҳ������������ļ̳���ϵ��û�еĻ�,��ô
 * ������ķ�ʽ���ǲ���switch...case..����if...else..����ĳһ������,��ִ��ĳһ�δ���
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(1, "bill");
		System.out.println(animal.toString());
		
		animal=new Dog(2, "jack");
		System.out.println(animal.toString());
	}
}
