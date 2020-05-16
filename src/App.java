
public class App {

	public static void main(String[] args) {

		Logger logger = new AsterickLogger();

		logger.Log("hello");
		logger.Error("hello");

		Logger logger1 = new SpacedLogger();
		logger1.Log("Hello");
		logger1.Error("Hello");

	}

}
