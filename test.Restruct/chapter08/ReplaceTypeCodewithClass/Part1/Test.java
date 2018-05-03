package chapter08.ReplaceTypeCodewithClass.Part1;

public class Test {
	public static void main(String[] args) {
		Person person=new Person(1); //这样参数传入的是一数值，可读性不好，容易bug
		System.out.println(person.get_bloodGroup()); //返回的也是一个数字，可读性不好，容易bug
	}
}
