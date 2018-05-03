package chapter08.DuplicateObservedData.Part2;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {

	private String name;
	private double observeredPrice; //表示观察到的房价
	
	
	public double getObserveredPrice() {
		return observeredPrice;
	}


	public void setObserveredPrice(double observeredPrice) {
		this.observeredPrice = observeredPrice;
	}


	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Double){
			System.out.println(this.name+"观察到的房价是："+(double)arg);
			this.observeredPrice=(double)arg;
		}
	}

}
