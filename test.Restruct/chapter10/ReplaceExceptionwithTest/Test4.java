package chapter10.ReplaceExceptionwithTest;

/**
 * 我觉得所说的用测试代替异常是下面这种穷凶极恶的用异常代替控制流程的情况
 */
public class Test4 {
	public static void main(String[] args) {
		 int a=1,b=2;
		 try {
			 if(a>1){
				 throw new Exception();
			 }
		} catch (Exception e) {
			System.out.println("继续if的条件下的执行代码");
			//然后这个catch块不是用来处理异常的，而是参与逻辑的，另一个程序执行块，
			
		}
		 
	}
}
