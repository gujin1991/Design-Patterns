package Decorator;

public class StarbuffCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Milk(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
	
	}

}
