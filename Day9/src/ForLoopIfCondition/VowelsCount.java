package ForLoopIfCondition;

public class VowelsCount {
	public static void main(String[] args) {
		String a="yogabalaji";
		char b[]=a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
