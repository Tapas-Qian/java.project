package chapter08.DuplicateObservedData.Part1;


public class House {
	private double price;

	public House(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
//		super.setChanged();
//		super.notifyObservers(price);
	}
}
