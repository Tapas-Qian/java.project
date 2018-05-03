package chapter08.ReplaceSubclasswithFields.Part2;

/**
 * 若子类中只有常量函数，没什么存在价值
 */
public class Test {
	public static void main(String[] args) {
		Person person=new Person("M");
		System.out.println(person.getCode());
	}
}
