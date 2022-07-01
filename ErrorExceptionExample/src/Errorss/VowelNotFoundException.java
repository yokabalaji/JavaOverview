package Errorss;

public class VowelNotFoundException {
	public static void main(String[] args) throws VowelsNotFound {
		String a = "n";
		try {
			if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
				System.out.println("vowels");
			} else {
				throw new VowelsNotFound("not contains vowels");
			}
		} catch (VowelsNotFound vf) {
			System.out.println(vf);
			System.out.println(vf.getMessage());
			System.out.println("nooo");
		}
	}

}
