package Iterator;

public class DinnerMenuIterator implements Iterator {
	String[] items;
	int position = 0;
	
	public DinnerMenuIterator(String[] menu) {
		this.items = menu;
	}
	
	
	@Override
	public boolean hasNex() {
		// TODO Auto-generated method stub
		if(position >= items.length || items[this.position] == null)
			return false;
		else
			return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String item = items[this.position];
		this.position++;
		return item;
	}
	
	public void remove() {
		if(this.position <= 0) {
			throw new IllegalStateException
			("You can't remove an item until you've done at least one next()");
		}
		
		if(items[this.position - 1] != null) {
			for(int i = this.position - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			
			items[items.length - 1] = null;
		}
	}

}
