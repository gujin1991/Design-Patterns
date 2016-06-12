package Iterator;
import java.util.*;

public class PancakeHouseMenu implements Menu {
	ArrayList<String> menuItems;
	
	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast");
		addItem("Regular Pancake Breakfast");
		addItem("Blueberry Pancakes");
		addItem("Waffles");
	}
	
	public void addItem(String item) {
		// TODO Auto-generated method stub
		this.menuItems.add(item);
	}
	
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PancakeHouseMenuIterator(this.menuItems);
	}
	
	public String toString() {
		return "Pancake House Menu";
	}
}
