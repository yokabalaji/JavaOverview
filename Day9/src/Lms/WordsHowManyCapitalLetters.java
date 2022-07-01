package Lms;

public class WordsHowManyCapitalLetters {
	public static void main(String[] args) {
		String word="LaPtoP";
		String a=word.toUpperCase();
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==a.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
