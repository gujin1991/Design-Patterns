package State;

public class HasQuarterState implements State {
	private GumballMachine machine;
	
	public HasQuarterState(GumballMachine m) {
		this.machine = m;
	}
	
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		this.machine.setState(this.machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		this.machine.setState(this.machine.getSoldState());
	}

	@Override
	public void dispend() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}
	
	public String toString() {
		return "waiting for turn of crank";
	}

}
