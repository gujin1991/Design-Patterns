package Strategy;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		DecoyDuck decoyDuck = new DecoyDuck();
		
		redHeadDuck.performQuack();
		decoyDuck.performQuack();
		
		decoyDuck.performFly();
		decoyDuck.setFlyBehavior(new FlyWithWings());
		decoyDuck.performFly();
		
	}

}
