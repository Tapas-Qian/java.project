package chapter07.IntroduceForeignMethod;

/**
 * ͨ���ڿͻ�����������һ��һ������Ϊ�������͵ĺ��������ӹ���
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
