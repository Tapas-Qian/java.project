package chapter07.IntroduceForeignMethod;

/**
 * 通过在客户代码中增加一个一服务类为参数类型的函数，增加功能
 */
public class Client {
	public void method( Server server){
		server.method();
		System.out.println("Yohoho...");
	}
	
	public static void main(String[] args) {
		Client client=new Client();
		client.method(new Server());
	}
}
