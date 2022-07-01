package ForLoopIfCondition;

public class Abcde {
	public static void main(String[] args) {
		int count=0;
		for(char i='A';i<='Z';i++) {
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
				count++;
				System.out.println(i+" is vowel");
			}
		}
		System.out.println(count);
	}

}
