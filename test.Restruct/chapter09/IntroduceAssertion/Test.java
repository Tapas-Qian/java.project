package chapter09.IntroduceAssertion;

/**
 * 断言，需要修改项目或者类文件的Property，增加参数 -ea
 */
public class Test {
	public static void main(String[] args) {
		int a=1;
		assert a>1:"xxxx";
		
	}
}
