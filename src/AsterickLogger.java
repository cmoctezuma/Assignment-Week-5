
public class AsterickLogger implements Logger {

	@Override
	public void Log(String info) {
		System.out.println("4:");
		System.out.println("***" + info + "***\n");

	}

	@Override
	public void Error(String error) {
		System.out.println("5:");
		System.out.println("******************\n\n" + "***Error: " + error + "***\n\n******************\n");
	}

}
