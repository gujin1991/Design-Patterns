package State;

public class SoldState implements State {
	private GumballMachine machine;
	
	public SoldState(GumballMachine m) {
		this.machine = m;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispend() {
		// TODO Auto-generated method stub
		machine.releaseBall();
		if (machine.getCount() > 0) {
			machine.setState(machine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			machine.setState(machine.getSoldOutState());
		}
	}
	
	public String toString() {
		return "dispensing a gumball";
	}

}
