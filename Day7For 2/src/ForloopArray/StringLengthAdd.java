package ForloopArray;

public class StringLengthAdd {
	public static void main(String[] args) {
		String []a= {"arun","pugazh","keerthana","praga","bhrathi"};
		int add=0;
for(int i=0;i<a.length;i++) {
	add=add+a[i].length();
}
System.out.println(add);
	}
}
