package chapter10.ReplaceExceptionwithTest;

/**
 * 这种runtimeException也可以自己提供try..catch语句捕获，但是没有必要
 * 
 * 不过如果是在我那样的AutoCAD的编程，异常都需要处理的
 * 
 * 也就说runtimeException系统只是捕获但是并没有处理
 * 
 * 奇怪，我的AutoCAD程序里面好像有的异常，AutoCAD也是能够自动处理的（给出错误信息），
 * 并不会导致崩溃，但是有的会
 * 
 * 那是不是说，上面那种给出消息的都是runtimeException，AutoCAD也是捕获+处理了的
 * 至于崩溃的都是checkedException，系统没有提供捕获需要程序员设计捕获
 * 
 * 至于先测试，就比如下面这种超界，就算测试了，超界了，程序怎么终止+给出消息呢呢？关键是终止
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		int[] array={5,2,4,21};
		Test2 test=new Test2();
		try {
			test.getNumber(100, array); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getNumber(int index,int[] array){
		return array[index];
	}
}
