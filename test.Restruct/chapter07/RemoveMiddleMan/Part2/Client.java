package chapter07.RemoveMiddleMan.Part2;

/**
 * �м�����ָ��
 * A.B.method1(),
 * A.B.method2(),
 * A.B.method3(),
 * 
 * ����method1��2��3ʵ���϶�Ӧ����C��method1��2��3
 * ��ôB�ͽ��м���
 */
public class Client {
	public static void main(String[] args) {
		
		Server server=new Server();
		server.getDelegateObj().method();
	}
}
