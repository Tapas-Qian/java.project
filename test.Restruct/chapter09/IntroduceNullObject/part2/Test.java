package chapter09.IntroduceNullObject.part2;

/**
 * ����NullAnimal����֮��Ȼ����ö�̬�Ե�ʱ���ڳ���һ��null���߷�null���󴫸�
 * һ�������Զ���֮�󣬶���һ����ʹ�÷�ʽ��null����ͨ����д�����Ѿ������˿��ܵ����
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=new Animal(1, "bill");
		System.out.println(animal);
		
		animal=new NullAnimal(0,null);
		System.out.println(animal);
	}
}
