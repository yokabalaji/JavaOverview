package ForloopArray;

public class AllArrayStringLastLetter {
	public static void main(String[] args) {
		String []a= {"java","python","c#","c++","javascript"};
for(int i=0;i<a.length;i++) {
	System.out.println(a[i].charAt(a[i].length()-1));
}
	}
}
