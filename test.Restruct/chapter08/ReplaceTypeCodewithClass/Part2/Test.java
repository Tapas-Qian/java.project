package chapter08.ReplaceTypeCodewithClass.Part2;

/**
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person person=new Person(new A()); //����ʵ���Ͽ�����BloodGroup����һ����������������new
		System.out.println(person.getBloodGroup());
	}
}
