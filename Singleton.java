
public class Singleton {
	private static Singleton unique = null;
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		if(unique == null) {
			unique = new Singleton();
		}
		
		return unique;
	}
	
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
