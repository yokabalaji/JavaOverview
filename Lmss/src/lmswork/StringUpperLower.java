package lmswork;

public class StringUpperLower {
	public static void main(String[] args) {
		String value="DataTyPes";
		char a[]=value.toCharArray();
		int count=0;
		int count1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>'a' && a[i]<'z') {
				count++;
			}else {
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
