package chapter09.RemoveControlFlag;

public class Test2 {
	public static void main(String[] args) {
		int[] array={10,30,2,45,23,24,5};
		for (int i = 0; i < array.length; i++) {
			if(array[i]==24){
				System.out.println("you 24");
				break;
			}
		}
	}
}
