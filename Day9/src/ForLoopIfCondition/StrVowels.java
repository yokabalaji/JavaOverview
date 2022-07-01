package ForLoopIfCondition;

public class StrVowels {
	public static void main(String[] args) {
		String a="balaji";
		int count=0;
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
				System.out.println(b[i]);
				count++;
			}
		}
		System.out.println(count);
	}

}
