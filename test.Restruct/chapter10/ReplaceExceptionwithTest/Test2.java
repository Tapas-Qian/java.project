package chapter10.ReplaceExceptionwithTest;

/**
 * ����runtimeExceptionҲ�����Լ��ṩtry..catch��䲶�񣬵���û�б�Ҫ
 * 
 * �������������������AutoCAD�ı�̣��쳣����Ҫ�����
 * 
 * Ҳ��˵runtimeExceptionϵͳֻ�ǲ����ǲ�û�д���
 * 
 * ��֣��ҵ�AutoCAD������������е��쳣��AutoCADҲ���ܹ��Զ�����ģ�����������Ϣ����
 * �����ᵼ�±����������еĻ�
 * 
 * ���ǲ���˵���������ָ�����Ϣ�Ķ���runtimeException��AutoCADҲ�ǲ���+�����˵�
 * ���ڱ����Ķ���checkedException��ϵͳû���ṩ������Ҫ����Ա��Ʋ���
 * 
 * �����Ȳ��ԣ��ͱ����������ֳ��磬��������ˣ������ˣ�������ô��ֹ+������Ϣ���أ��ؼ�����ֹ
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
