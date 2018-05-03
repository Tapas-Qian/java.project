package chapter08.ReplaceTypeCodewithStateStrategy.Part2;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void doAnything(){
		this.strategy.doSomting();
	}
}
