package chapter07.IntroduceLocalExtension.Part2;

/**
 * 通过继承，组合扩展服务类
 */
public class Client {
	public static void main(String[] args) {
		NewServer dog=new NewServer();
		dog.method();
		dog.method2();
	}
}
