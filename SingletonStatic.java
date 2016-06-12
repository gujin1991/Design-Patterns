
public class SingletonStatic {
	private static SingletonStatic unique = new SingletonStatic();
	
	private SingletonStatic() {}
	
	public static SingletonStatic getSingleton() {
		return unique;
	}
	
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
