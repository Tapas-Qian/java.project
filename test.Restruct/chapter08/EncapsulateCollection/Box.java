package chapter08.EncapsulateCollection;

import java.util.HashSet;
import java.util.Set;

public class Box {
	Set<Apple> set=new HashSet<>();
	
	/**
	 * ûnewһ��������һ���µĶ��������ǲ�һ���ģ�����size��8
	 */
	public void initializeBox(){
		set.add(new Apple("apple3"));
		set.add(new Apple("apple1"));
		set.add(new Apple("apple2"));
		set.add(new Apple("apple2"));
		set.add(new Apple("apple2"));
		set.add(new Apple("apple3"));
		set.add(new Apple("apple1"));
		set.add(new Apple("apple2"));
	}
	
	public int getBoxSize(){
		return set.size();
	}
}
