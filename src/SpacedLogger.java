
public class SpacedLogger implements Logger {

	@Override
	public void Log(String info) {
		System.out.println("7:");
		for (int i = 0; i < info.length(); i++) {
			String infoSpaced = info.charAt(i) + " ";
			System.out.print(infoSpaced);

		}
		System.out.println();

	}

	@Override
	public void Error(String error) {
		// System.out.println("ERROR: " + error.replaceAll(".", "$0 "));
		System.out.println("8:");
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			String errorSpaced = error.charAt(i) + " ";
			System.out.print(errorSpaced);

		}

	}

}
