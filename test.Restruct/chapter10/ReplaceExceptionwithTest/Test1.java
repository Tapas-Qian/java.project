package chapter10.ReplaceExceptionwithTest;

/**
 * 比如访问一个数组的元素，那么索引确实是可以先通过测试得到保证的
 * 而IO连接，是否连接上也是可以通过判断确定的，但是没有finally这种出现问题确保释放的能力
 * 是的如果用if测试，而if块中的如果出现异常，那么就终止了后面代码执行的机会
 * 
 * 
 * 而实际上我写的AutoCad程序的异常，更加是执行一个任务，如果任务中间出现了上面问题，那么
 * 这个任务结果肯定是错误的，那么直接异常，给出信息，结束程序，防止崩溃
 * 嗯是的，有防止崩溃的作用
 * 
 * 终止程序，给出错误信息，防止崩溃
 * 
 * 在我的AutoCAD程序里面必须是使用异常，不然就崩溃，因为程序不能继续执行下去，通过一般的if
 * 什么的控制语句根本不能让程序终止，让AutocAD正常继续运行，防止崩溃
 * 
 * 但是我可以用if上面的测试让程序尽量少的中断，但是又的if是没办法测试的，比如字符串匹配
 */
public class Test1 {
	public static void main(String[] args) {
		int[] array={5,2,4,21};
		Test1 test=new Test1();
		//这种runtimeException就算不提供try..catch语句，程序也会捕获的
		test.getNumber(100, array); 
	}
	
	public int getNumber(int index,int[] array){
		return array[index];
	}
}
