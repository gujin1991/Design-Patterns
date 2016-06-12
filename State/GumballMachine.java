package State;

public class GumballMachine {
	State soldOutState;
	State hasQuarterState;
	State noQuarterState;
	State soldState;
	
	State state = this.soldOutState;
	int count = 0;
	
	public GumballMachine(int gumballNum) {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		
		this.count = gumballNum;
		if(gumballNum > 0) {
			this.state = this.noQuarterState;
		}
	}
	
	public void insertQuarter() {
		this.state.insertQuarter();
	}
	
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}
	
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispend();
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(this.count != 0) {
			this.count--;
		}
	}
	
	int getCount() {
		return this.count;
	}
	
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
