package chapter08.ChangeValuetoReference.Part1;

public class Order {
	private Customer customer;
	
	public Order(Customer customer) {
		super();
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
