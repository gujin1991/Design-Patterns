package State;

public class SoldOutState implements State {
	private GumballMachine machine;
	
	public SoldOutState(GumballMachine m) {
		this.machine = m;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispend() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}
	
	public String toString() {
		return "sold out";
	}
}
