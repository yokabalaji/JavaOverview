package ForLoopIfCondition;

public class StringUpperCount {
	public static void main(String[] args) {
		String a="Balaji";
		String b=a.toUpperCase();
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				upperCase++;
				
			}else {
				lowerCase++;
				
			}
		}
		System.out.println("uppercase count "+upperCase);
		System.out.println("lowercase count "+lowerCase);
	}

}
