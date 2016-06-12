
public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton client = Singleton.getSingleton();
		
		System.out.println(client.getDescription());
	}

}
