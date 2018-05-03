package chapter07.RemoveMiddleMan.Part1;

/**
 * 这里的委托指代的是那个调用链
 * 隐藏指的是将客户中的委托链转移动服务类中去
 */
public class Server {

	public void method(){
		 new DelegateClass().method();;
	}
}
