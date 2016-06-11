package Decorator;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.10 + this.beverage.cost();
	}

}
