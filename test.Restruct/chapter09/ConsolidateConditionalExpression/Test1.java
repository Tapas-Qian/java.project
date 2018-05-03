package chapter09.ConsolidateConditionalExpression;

public class Test1 {
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		xx(a, b, c);
	}

	private static int xx(int a, int b, int c) {
		if(a>1) return 0;
		if(b>1) return 0;
		if(c>1) return 0;
		else return 1;
	}
}
