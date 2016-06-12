
public class SingletonSync {
	private static SingletonSync unique = null;
	
	private SingletonSync() {}
	
	public static synchronized SingletonSync getSingleton() {
		if(unique == null) {
			unique = new SingletonSync();
		}
		
		return unique;
	}
	
	public String getDescription() {
		return "I'm a classic Singleton!";
	}

}
