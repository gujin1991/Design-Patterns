package Iterator;

public class DinnerMemu implements Menu {
	String[] menuItems;
	static final int size = 6;
	int numbetOfItems = 0;
	
	public DinnerMemu() {
		this.menuItems = new String[this.size];
		
		addItem("Vegetarian BLT");
		addItem("BLT");
		addItem("Soup of the day");
		addItem("Hotdog");
		addItem("Steamed Veggies and Brown Rice");
		addItem("Pasta");
	}

	private void addItem(String name) {
		// TODO Auto-generated method stub
		if(this.numbetOfItems >= this.size) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");			
		} else {
			this.menuItems[this.numbetOfItems] = name;
			this.numbetOfItems++;
		}
	}
	
	public String[] getMenu() {
		return this.menuItems;
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new DinnerMenuIterator(this.menuItems);
	}
	
	public String toString() {
		return "Diner Menu";
	}

}
