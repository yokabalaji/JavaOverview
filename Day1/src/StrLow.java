
public class StrLow {
	public static void main(String[] args) {
		String a="BALAJI";
		String b="BAlaji";
		String a1=a.toLowerCase();
		int a2=a.length();
		String a3=a.concat(b);
		boolean a4=a.contains("A");
		boolean a5=a.equals(b);
		boolean a6=a.equalsIgnoreCase(b);
		boolean a7=a.startsWith("B");
		boolean a8=a.endsWith("I");
		char a9=a.charAt(2);
		int a10=a.indexOf('A');
		
		
		System.out.println("Lower case"+a1+'\n'+"length="+a2+'\n'+"concat="+a3+'\n'+"contains="+a4+'\n'+"Equals="+a5+'\n'+"equalsIgnore="+a6+'\n'+"startswith="+a7+'\n'+"endswith="+a8+'\n'+"charAt="+a9+'\n'+"index Of="+a10);
	}

}
