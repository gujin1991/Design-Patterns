package Singleton;

public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton client = Singleton.getSingleton();
		
		System.out.println(client.getDescription());
	}
	
	public static int getNthFibo(int n) {
		int n1 = 1;
		int n2 = 0;
		
		int nth = 1;
		for(int i = 2; i <= n; i++) {
			nth = n1 + n2;
			n2 = n1;
			n1 = nth;
		}
		
		return nth;
	}
	
	

}
