package chapter07.HideDelegate.Part2;

/**
 * 这里的委托指代的是那个调用链
 * 隐藏指的是将客户中的委托链转移动服务类中去
 */
public class Client {
	public static void main(String[] args) {
		
		Server server=new Server();
		server.method();
	}
}
