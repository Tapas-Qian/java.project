package chapter08.ChangeValuetoReference.Part2;

public class Order {
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public Order(String customerName) {
		super();
		this.customer = Customer.getNamed(customerName);
	}
	
}
