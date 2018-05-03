package chapter08.ReplaceSubclasswithFields.Part1;

public class Test {
	public static void main(String[] args) {
		Person person1=new Male();
		System.out.println(person1.getCode());
		
		Person person2=new Female();
		System.out.println(person2.getCode());
	}
}
