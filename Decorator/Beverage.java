package Decorator;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
