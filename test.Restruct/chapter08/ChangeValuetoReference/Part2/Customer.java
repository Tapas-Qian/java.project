package chapter08.ChangeValuetoReference.Part2;

import java.util.Hashtable;

public class Customer {
	private String name;
	public static Hashtable<String, Customer> hashtable=new Hashtable<>();
	
	private Customer(String name) {
		super();
		this.name = name;
	}
	
	static void loadCustomers(){
		new Customer("bill").store();
		new Customer("jack").store();
		new Customer("lucy").store();
	}
	
	private void store(){
		hashtable.put(this.getName(), this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Customer getNamed(String name){
		return (Customer) hashtable.get(name);
	}
}
