package Lms;

public class HowmanyConsonantsVowels {
	public static void main(String[] args) {
		String num="water";
		char []a=num.toCharArray();
		int count=0;
		int count1=0;
		for(int i=0;i<num.length();i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				count++;
			}else {
				count1++;
			}
			
		}
		System.out.println("consonant "+count1);
		System.out.println("vowels "+count);
	}

}
