package Day11FunCall;

public class Facto {
	public int facto(int a) {
		int b = 1;
		for (int i = 1; i <= a; i++) {
			b *= i;

		}
		return b;
	}

}
