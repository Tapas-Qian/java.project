package chapter10.ReplaceExceptionwithTest;

/**
 * 好吧，我承认，测试没什么卵用，还是需要一个异常才能在程序代码中间终止程序
 */
public class Test3 {
	public static void main(String[] args) {
		int[] array={5,2,4,21};
		Test2 test=new Test2();
		int index=100;
		xx(array, test, index);
		//下面还有别的执行代码
	}

	private static void xx(int[] array, Test2 test, int index) {
		if(index>=0&&index<=100){
			test.getNumber(index, array); 
		}
		else{
			System.out.println("超界");
		}
	}
	
	public int getNumber(int index,int[] array){
		return array[index];
	}
}
