package singleton.tape4;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		return instance;
	}
}



