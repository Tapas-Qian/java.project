package chapter09.DecomposeConditional;

public class Test2 {
	public static void main(String[] args) {
		int a=1,b=2,c=3,d,e;
		if(isOK(a, b, c)){
			d=getD(a, b, c);
		}
		else{
			e=getE(a, b);
		}
	}

	private static int getE(int a, int b) {
		return a+b+b;
	}

	private static int getD(int a, int b, int c) {
		return a+b+c+c;
	}

	private static boolean isOK(int a, int b, int c) {
		return a+b>b+c&&a-b<a+b;
	}
}
