package chapter08.ReplaceTypeCodewithClass.Part1;

public class Test {
	public static void main(String[] args) {
		Person person=new Person(1); //���������������һ��ֵ���ɶ��Բ��ã�����bug
		System.out.println(person.get_bloodGroup()); //���ص�Ҳ��һ�����֣��ɶ��Բ��ã�����bug
	}
}
