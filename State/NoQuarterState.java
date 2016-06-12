package State;

public class NoQuarterState implements State {
	private GumballMachine machine;
	
	public NoQuarterState(GumballMachine m) {
		this.machine = m;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You inserted a quarter");
		this.machine.setState(this.machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispend() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
