package chapter10.ReplaceExceptionwithTest;

/**
 * �ðɣ��ҳ��ϣ�����ûʲô���ã�������Ҫһ���쳣�����ڳ�������м���ֹ����
 */
public class Test3 {
	public static void main(String[] args) {
		int[] array={5,2,4,21};
		Test2 test=new Test2();
		int index=100;
		xx(array, test, index);
		//���滹�б��ִ�д���
	}

	private static void xx(int[] array, Test2 test, int index) {
		if(index>=0&&index<=100){
			test.getNumber(index, array); 
		}
		else{
			System.out.println("����");
		}
	}
	
	public int getNumber(int index,int[] array){
		return array[index];
	}
}
