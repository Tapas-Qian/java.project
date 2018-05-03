package chapter08.ChangeReferencetoValue.Part2;

/**
 * 重写了euqals方法，能够正确的根据值判断相等性了
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD")));
	}
}
