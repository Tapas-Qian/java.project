package chapter08.ReplaceTypeCodewithClass.Part1;

public class Person {
	public static final int A=1;
	public static final int B=2;
	
	private int _bloodGroup;

	public int get_bloodGroup() {
		return _bloodGroup;
	}

	public void set_bloodGroup(int _bloodGroup) {
		this._bloodGroup = _bloodGroup;
	}

	public Person(int _bloodGroup) {
		super();
		this._bloodGroup = _bloodGroup;
	}
	
	
}
