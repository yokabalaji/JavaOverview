package ForTLms;

public class ForChar {
	public static void main(String[] args) {
		String a="balaji";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
				System.out.println(b[i]+" its a vowels word");
			}
			else {
				System.out.println(b[i]+" its not vowels");
			}
		}
	}

}
