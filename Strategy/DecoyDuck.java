package Strategy;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a duck Decoy");
	}

}
