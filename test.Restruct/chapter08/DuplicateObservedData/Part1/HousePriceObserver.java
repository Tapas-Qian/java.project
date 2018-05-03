package chapter08.DuplicateObservedData.Part1;


public class HousePriceObserver  {
	private String name;

	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}
	
//	@Override
//	public void update(Observable o, Object arg) {
//		if(arg instanceof Double){
//			System.out.println(this.name+"观察到的房价是："+(double)arg);
//		}
//	}

}
