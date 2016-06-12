package Iterator;
import java.util.*;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMemu dinerMenu = new DinnerMemu();
		
		// with no iterators
		System.out.println("\nMENU\n----\nBREAKFAST");
		ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			String menuItem = (String)breakfastItems.get(i);
			System.out.println(menuItem);
		}

		System.out.println("\nLUNCH");
		String[] lunchItems = dinerMenu.getMenu();

		for (int i = 0; i < lunchItems.length; i++) {
			String menuItem = lunchItems[i];
			System.out.println(menuItem);
		}
		
		// with iterators
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator); 
	}
	
	private static void printMenu(Iterator iterator) {
		while (iterator.hasNex()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);

		}
	}


}
