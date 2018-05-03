package chapter08.ChangeReferencetoValue.Part1;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD")));
	}
}
