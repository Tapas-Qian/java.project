package chapter08.ChangeReferencetoValue.Part2;

/**
 * ��д��euqals�������ܹ���ȷ�ĸ���ֵ�ж��������
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD")));
	}
}
