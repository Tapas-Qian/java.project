package chapter08.ReplaceSubclasswithFields.Part2;

public  class Person {
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Person(String string) {
		super();
		this.code = string;
	}
	
}
