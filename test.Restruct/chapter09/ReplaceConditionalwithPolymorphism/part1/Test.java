package chapter09.ReplaceConditionalwithPolymorphism.part1;

/**
 * switch/if�������һ��ʹ�ã��������ԵĻ���ʹ�ã�ûʲô����
 * switch/if���µ��ڶ�������ж�θ���һ��������ʹ�ã�ȱ��ܴ�
 * �Ľ�1����ÿ��case���е�д�ɼ̳���ϵ��Ȼ��ͨ��һ��switch/if�ﵽ��μ���һ�ε�Ч��
 * �Ľ�2��������ļ̳���ϵ�����ϣ�д�ɷ������+��������������switch/if
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
			System.out.println("I am dog"); //���������һЩ��������ص�һЩ����
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
			System.out.println("������"); 
			break;
		case "Cat":
			System.out.println("������");
			break;
		default:
			System.out.println("^(&3#$%%#$");
		}
	}
}
