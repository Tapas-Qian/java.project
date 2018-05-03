package chapter09.ConsolidateConditionalExpression;

public class Test2 {
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		getData(a, b, c);
	}

	private static int getData(int a, int b, int c) {
		if(isOK(a, b, c)) return 0;
		else return 1;
	}

	private static boolean isOK(int a, int b, int c) {
		return a>1||b>1||c>1;
	}
}
