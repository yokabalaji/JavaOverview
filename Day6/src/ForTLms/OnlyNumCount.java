package ForTLms;

public class OnlyNumCount {
public static void main(String[] args) {
	String word="123455iiorgd6";
	char a[]=word.toCharArray();
	int count=0;
	for(int i=0;i<a.length;i++) {
	//	if(a[i]>'a' && a[i]>'z' || a[i]>'A' && a[i]>'Z') {
		//if(a[i]==0 || a[i]==1 || a[i]==2 || a[i]==3 || a[i]==4 || a[i]==5 || a[i]==6 || a[i]==7 || a[i]==8 || a[i]==9) {
//         count++;
//			}else {
//			System.out.println("none");
//		}
//	}
		if(a[i]>=48 && a[i]<=57) {
			count++;
		}
		// if(Character.isDigit(word.charAt(i))) {
			// count++;
	}
	System.out.println(count);
}
}
