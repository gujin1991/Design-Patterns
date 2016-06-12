package Iterator;
import java.util.*;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList<String> menuItems;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList al) {
		this.menuItems = al;
	}

	@Override
	public boolean hasNex() {
		// TODO Auto-generated method stub
		int size = this.menuItems.size();
		if(this.position < size) {
			//this.position++;
			return true;
		} else
			return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String item = this.menuItems.get(position);
		this.position++;
		return item	;
	}
	
	public void remove() {
		if(this.position <= 0) {
			throw new IllegalStateException
			("You can't remove an item until you've done at least one next()");

		} else {
			this.menuItems.remove(position - 1);
			this.position--;
		}
	}

}
