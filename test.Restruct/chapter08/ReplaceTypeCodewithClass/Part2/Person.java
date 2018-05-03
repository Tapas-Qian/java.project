package chapter08.ReplaceTypeCodewithClass.Part2;

public class Person {
	
	private BloodGroup bloodGroup;

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Person(BloodGroup bloodGroup) {
		super();
		this.bloodGroup = bloodGroup;
	}
	
	
}
