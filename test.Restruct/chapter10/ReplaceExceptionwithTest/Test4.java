package chapter10.ReplaceExceptionwithTest;

/**
 * �Ҿ�����˵���ò��Դ����쳣�������������׼�������쳣����������̵����
 */
public class Test4 {
	public static void main(String[] args) {
		 int a=1,b=2;
		 try {
			 if(a>1){
				 throw new Exception();
			 }
		} catch (Exception e) {
			System.out.println("����if�������µ�ִ�д���");
			//Ȼ�����catch�鲻�����������쳣�ģ����ǲ����߼��ģ���һ������ִ�п飬
			
		}
		 
	}
}
