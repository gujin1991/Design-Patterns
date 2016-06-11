package Strategy;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Red Headed duck");
	}

}
