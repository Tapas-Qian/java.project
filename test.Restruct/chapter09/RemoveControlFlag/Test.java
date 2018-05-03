package chapter09.RemoveControlFlag;

/**
 * pan duan yige shuzu shifou you 24
 */
public class Test {
	public static void main(String[] args) {
		int[] array={10,30,2,45,23,24,5};
		boolean isFalse=false;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==24){
				isFalse=true;
			}
		}
		System.out.println(isFalse);
	}
}
