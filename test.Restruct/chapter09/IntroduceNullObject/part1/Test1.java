package chapter09.IntroduceNullObject.part1;

public class Test1 {
	public static void main(String[] args) {
		int a;
		Animal animal=new Animal(1, "bill");
//		Animal animal=null;
		if(animal==null){
			a=0;
		}
		else {
			a=1;
		}
	}
}
