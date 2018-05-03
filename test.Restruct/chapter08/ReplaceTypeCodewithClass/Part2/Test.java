package chapter08.ReplaceTypeCodewithClass.Part2;

/**
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person person=new Person(new A()); //这里实际上可以在BloodGroup中设一个工厂方法而不是new
		System.out.println(person.getBloodGroup());
	}
}
