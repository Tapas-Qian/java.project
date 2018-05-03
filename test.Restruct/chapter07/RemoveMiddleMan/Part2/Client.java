package chapter07.RemoveMiddleMan.Part2;

/**
 * 中间人是指：
 * A.B.method1(),
 * A.B.method2(),
 * A.B.method3(),
 * 
 * 但是method1，2，3实际上对应的是C的method1，2，3
 * 那么B就叫中间人
 */
public class Client {
	public static void main(String[] args) {
		
		Server server=new Server();
		server.getDelegateObj().method();
	}
}
