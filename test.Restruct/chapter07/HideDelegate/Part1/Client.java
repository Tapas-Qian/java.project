package chapter07.HideDelegate.Part1;

public class Client {
	public static void main(String[] args) {
		
		Server server=new Server();
		server.getDelegateObj().method();
	}
}
